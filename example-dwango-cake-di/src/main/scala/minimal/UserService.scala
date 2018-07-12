package minimal

/**
  * 実際にUserRepositoryを使う側
  */

trait UserService extends UsesUserRepository {
  // 略
}

object UserService extends UserService with MixInUserRepository