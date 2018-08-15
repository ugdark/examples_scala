package domain.models

case class User(id: UserId, name: String, follows: Seq[UserId])

