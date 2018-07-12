package example.model

import scala.util.Try

trait UserRepository {

  def store(user: User): Try[User]

  def resolveBy(id: Long): Try[User]

  def deleteBy(id: Long): Try[Boolean]

}
