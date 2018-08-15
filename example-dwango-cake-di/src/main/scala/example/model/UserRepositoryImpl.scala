package example.model

import scala.util.Try

object UserRepositoryImpl extends UserRepository {
  private val values: scala.collection.mutable.Map[Long, User] =
    scala.collection.mutable.Map.empty

  def store(user: User): Try[User] = Try {
    values.update(user.id, user)
    values(user.id)
  }

  def resolveBy(id: Long): Try[User] = Try {
    values(id)
  }

  def deleteBy(id: Long): Try[Boolean] = Try {
    values.remove(id).isEmpty
  }

}
