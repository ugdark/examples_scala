


lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  organization := "com.example",
  scalaVersion := "2.12.6",
  test in assembly := {}
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "example-assembly-config",
    mainClass in assembly := Some ("assembly.config.Example"),
    assemblyJarName in assembly := "hello.jar",
  )
  .settings(
    libraryDependencies += "com.typesafe" % "config" % "1.3.3"
  )
