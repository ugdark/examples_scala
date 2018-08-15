package minimal

/**
  * UserRepositoryのインターフェース部分
  */
trait UsesUserRepository {
  val userRepository: UserRepository
}

trait UserRepository {
  // 略
}
