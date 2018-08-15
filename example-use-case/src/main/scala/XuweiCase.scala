import Main.UserId
import scalaz.EitherT

import scala.concurrent.Future

/***
  * https://xuwei-k.hatenablog.com/entry/20140919/1411136788
  * がくぞさんのを確認
  */

sealed trait Error


/** 引数であたえられたUserIdのUserが、そもそも存在しなかった場合 */
final case class UserNotFound(userId: UserId) extends Error

/** データベースにつながらなかったとか、そういうの */
final case class ConnectionError(message: String) extends Error

final case class User(id: UserId, name: String)

object Main {
  type UserId = Long

}

object UsersRepository {
  def followers(userId: UserId): Either[Error, List[User]] = ???

  // 非同期の場合
  def asyncFollowers(userId: UserId): Future[Either[Error, List[User]]] = ???

  def monadFollowers(userId: UserId): EitherT[Future, Error, List[User]] = ???
}


object UseCase1 {

  private val usersRepository = UsersRepository

  // とりあえず例外の為にEitherにする
  def isFriends0(user1: UserId, user2: UserId): Either[Error, Boolean] =
    for {
      a <- usersRepository.followers(user1).right
      b <- usersRepository.followers(user2).right
    } yield a.exists(_.id == user2) && b.exists(_.id == user1)

  def isFriends1(user1: UserId, user2: UserId): Future[Either[Error, Boolean]] =
    for {
      a <- usersRepository.asyncFollowers(user1)
      b <- usersRepository.asyncFollowers(user2)
    } yield for {
      x <- a.right
      y <- b.right
    } yield x.exists(_.id == user2) && y.exists(_.id == user1)


  def isFriends2(user1: UserId, user2: UserId): Future[Either[Error, Boolean]] =
    usersRepository.asyncFollowers(user1).flatMap {
      case Right(a) =>
        usersRepository.asyncFollowers(user2).map {
          case Right(b) =>
            Right(a.exists(_.id == user2) && b.exists(_.id == user1))
          case Left(e) =>
            Left(e)
        }
      case Left(e) =>
        Future.successful(Left(e))
    }

  /**
  なぜ2パターン示したか？というと、それぞれ微妙に動作が違うからです。なにが違うかわかりますか？
  正常系の場合の動作は同じですが、followers(user1)がエラーだった場合の動作が異なります。
  上記のfor式を2回使ってるisFriends1のほうでは、followers(user1)がエラーでも、followers(user2)の呼び出しは必ず実行されます。
  一方、isFriends2のほうは、followers(user1)の呼び出しがエラーだと、followers(user2)は実行されません。

  */

  def isFriends3(user1: UserId, user2: UserId): EitherT[Future, Error, Boolean] =
    for{
      a <- usersRepository.monadFollowers(user1)
      b <- usersRepository.monadFollowers(user2)
    } yield a.exists(_.id == user2) && b.exists(_.id == user1)

  /**
    * 1,2に比べてわかりやすくなった？
    */
}
