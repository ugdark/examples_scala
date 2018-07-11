lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  organization := "com.example",
  scalaVersion := "2.12.6",
  test in assembly := {}
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    mainClass in assembly := Some("com.example.Main"),
    assemblyJarName in assembly := "hello.jar",
  )
