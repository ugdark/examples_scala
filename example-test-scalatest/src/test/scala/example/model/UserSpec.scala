package example.model

import org.scalatest.FreeSpec

class UserSpec extends FreeSpec {

  "User" - {
    "create" in {
      val user = User(1L, "test@example.com", "yamada")
      assert(user.name === "yamada")
    }
  }
}
