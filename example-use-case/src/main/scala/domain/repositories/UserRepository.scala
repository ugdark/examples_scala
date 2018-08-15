package domain.repositories

import domain.models.{User, UserId}

import scala.concurrent.Future

object UserRepository {

  private var data = scala.collection.mutable.Map.empty[UserId, User]

  def store(user: User): Future[Unit] = {
    data += user.id -> user
    Future.successful()
  }

  def findById(id: UserId): Future[Option[User]] = {
    Future.successful(data.get(id))
  }

  def createDummyData: Unit = {
    Seq(
      User(UserId(1), "yamada", Seq(UserId(2), UserId(3))),
      User(UserId(2), "nishiyama", Seq(UserId(1))),
      User(UserId(3), "chiba", Seq.empty[UserId])
    ).foreach(user => {
      store(user)
    })

  }

  createDummyData
}
