//package domain
//
//import domain.models.UserId
//import domain.repositories.UserRepository
//
//import scala.concurrent.Future
//
//class UseCaseExample {
//
//  /**
//    * 相互フォローなら友達とする
//    */
//  def isFriend(id1: UserId, id2: UserId): Future[Either[Error, Boolean]] = {
//    for {
//      user1 <- UserRepository.findById(id1)
//      user2 <- UserRepository.findById(id2)
//    } yield {
//      user1.find {
//        _.follows.map { uf1 =>
//
//
//        }
//      }
//
//    }
//  }
//}
