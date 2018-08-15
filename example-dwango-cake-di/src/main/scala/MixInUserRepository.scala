trait MixInUserRepository extends UsesUserRepository {
  val userRepository = UserRepositoryImpl
}

object UserRepositoryImpl extends UserRepository {
  // 略
}
