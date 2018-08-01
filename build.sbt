
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


lazy val exampleScalaDoc = Project("example-scaladoc", file("example-scaladoc"))
  .settings(commonSettings: _*)
  .settings(testSettings: _*)
  .settings(
    Seq(
      scalacOptions in(Compile, doc) := Seq("-diagrams")
    )
  )

lazy val exampleBasicCollectionConvert = Project("example-basic-collection-convert", file("example-basic-collection-convert"))
  .settings(commonSettings)


lazy val exampleBasicFuture = Project("example-basic-future", file("example-basic-future"))
  .settings(commonSettings)


lazy val examplePasswordBCrypt = Project("example-password-bcrypt", file("example-password-bcrypt"))
  .settings(commonSettings)
  .settings(
    libraryDependencies += "org.springframework.security" % "spring-security-core" % "5.0.6.RELEASE"
  )

lazy val exampleConfig = Project("example-config", file("example-config"))
  .settings(commonSettings)
  .settings(
    libraryDependencies += "com.typesafe" % "config" % "1.3.3"
  )
