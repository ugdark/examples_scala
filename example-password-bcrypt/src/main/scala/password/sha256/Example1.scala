package password.sha256

import java.security.MessageDigest

/**
  * Futureを同期させる処理
  */
object Example1 extends App {

  var dbPasswordHash: String = ""

  def sequence = {
    val password: String =
      "tpd[auLPx&eRLv};Timf9tepFMqP@Jgx9oVsmGjsJngmg3q2er26Cd$eX4LMWh[u"
    // hash化
    val passwordHash = createHash(password)

    (1 to 20).foreach { i =>
      println("check" + i + "[" + createHash(password))
    }

    // DB保存
    toDB(passwordHash)

    println(authenticate(password))
  }

  def createHash(password: String): String = {
    MessageDigest
      .getInstance("MD5")
      .digest(password.getBytes)
      .map("%02x".format(_))
      .mkString
  }

  def authenticate(password: String): Boolean = {
    val hashString = fromDB()
    val newPasswordHash = MessageDigest
      .getInstance("MD5")
      .digest(password.getBytes)
      .map("%02x".format(_))
      .mkString
    newPasswordHash == hashString
  }

  private def fromDB(): String = {
    Example1.dbPasswordHash
  }

  private def toDB(passwordHash: String): Unit = {
    Example1.dbPasswordHash = passwordHash
  }

  sequence
}
