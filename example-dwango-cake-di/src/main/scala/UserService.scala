trait UserService extends UsesUserRepository {
  // 略
}

object UserService extends UserService with MixInUserRepository