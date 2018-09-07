package official


import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * 公式のサンプルから
  * https://github.com/gatling/gatling-sbt-plugin-demo/blob/master/src/it/scala/computerdatabase/BasicItSimulation.scala
  */
class BasicItSimulation extends Simulation {

  val httpConf = http
    .baseURL("http://computer-database.gatling.io") // Here is the root for all relative URLs

  val scn = scenario("Scenario Name") // A scenario is a chain of requests and pauses
    .exec(http("request_1")
    .get("/"))
    .pause(7) // Note that Gatling has recorder real time pauses

  setUp(scn.inject(atOnceUsers(1)).protocols(httpConf))
}