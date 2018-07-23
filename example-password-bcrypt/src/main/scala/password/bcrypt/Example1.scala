package password.bcrypt

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

/**
  * Futureを同期させる処理
  */
object Example1 extends App {

  var dbPasswordHash: String = ""

  def sequence = {
    val password: String = "tpd[auLPx&eRLv};Timf9tepFMqP@Jgx9oVsmGjsJngmg3q2er26Cd$eX4LMWh[u"
    // hash化
    val passwordHash = createHash(password)

    (1 to 20).foreach { i =>
      val passwordHash = createHash(password)
      val check = new BCryptPasswordEncoder().matches(password, passwordHash)
      println("check" + i + "[" + passwordHash + "]["+ check +"]")
    }

    // DB保存
    toDB(passwordHash)

    println(authenticate(password))
  }

  def createHash(password: String): String = {
    new BCryptPasswordEncoder().encode(password)
  }

  def authenticate(password: String): Boolean = {
    val hashString = fromDB()
    new BCryptPasswordEncoder().matches(password, hashString)
  }

  private def fromDB(): String = {
    Example1.dbPasswordHash
  }

  private def toDB(passwordHash: String): Unit = {
    Example1.dbPasswordHash = passwordHash
  }

  sequence

}
