
lazy val commonSettings = Seq(
  version := "1.0",
  organization := "com.kokodayo",
  startYear := Some(2018),
  scalaVersion := "2.12.6",
  scalacOptions := Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-Xlint",
  )
)

lazy val testSettings = libraryDependencies ++= {
  Seq(
    "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"
  )
}



lazy val exampleDwangoCakeDI = Project("example-dwango-cake-di", file("example-dwango-cake-di"))
  .settings(commonSettings: _*)

lazy val exampleTestScalaTest = Project("example-test-scalatest", file("example-test-scalatest"))
  .settings(commonSettings: _*)
  .settings(testSettings: _*)
