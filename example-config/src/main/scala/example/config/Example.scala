package example.config

import com.typesafe.config.{Config, ConfigFactory}

object Example extends App {

  def applicationConf() {
    val config: Config = ConfigFactory.load()
    val child = config.getString("example.sec2.child")
    println("example.sec2.child:[" + child + "]")

    val example = config.getConfig("example")
    println("example:[" + example + "]")
    println("environment:[" + config.getString("environment") + "]")
  }


  //val config: Config = ConfigFactory.load(System.getProperty("user.dir") + "/application.conf")
  //val child = config.getString("example.sec2.child")

  applicationConf()

}
