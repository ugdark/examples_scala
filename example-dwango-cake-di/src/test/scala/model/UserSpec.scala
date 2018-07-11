package model

import java.util.UUID

import org.scalatest.FreeSpec

class UserSpec extends FreeSpec {

  "User" - {
    "create" in {
      val user = User(UUID.randomUUID(), "test@example.com", "yamada")
      assert()
    }
  }
}
