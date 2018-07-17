name := "example-flyway"

version := "1.0"

scalaVersion := "2.12.1"

enablePlugins(FlywayPlugin)

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "8.0.11"
)

flywayUrl := "jdbc:mysql://localhost:3306/bbs"
flywayUser := "root"
flywayPassword := ""
flywayLocations += "db/migration/bbs"
