package domain.errors

import domain.models.UserId


object Errors {

  def userNotFound(userId: UserId): Error =
    UserNotFound(userId)

  def ConnectionError(msg: String): Error =
    ConnectionError(msg)

  def TimeoutError(msg: String): Error =
    TimeoutError(msg)
}