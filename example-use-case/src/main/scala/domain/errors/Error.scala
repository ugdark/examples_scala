package domain.errors

import domain.models.UserId

sealed trait Error

/** 引数であたえられたUserIdのUserが、そもそも存在しなかった場合 */
final case class UserNotFound(userId: UserId) extends Error

/** データベースにつながらなかったとか、そういうの */
final case class ConnectionError(msg: String) extends Error

final case class TimeoutError(msg: String) extends Error
