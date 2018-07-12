package example

import example.model.{MixInUserRepository, User}

object Example extends App with MixInUserRepository {

  def check() = {
    val yamada = User(1L, "test@example.com", "yamada")
    val nishiyama = User(2L, "test@example.com", "yamada")
    userRepository.store(yamada)
    userRepository.store(nishiyama)
    println (userRepository.resolveBy(1))
    println (userRepository.resolveBy(2))
    userRepository.deleteBy(1)
    println(userRepository.resolveBy(1))

  }

  check
}
