logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// update等が早くなる
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.3")

// scalaのコードフォーマッター
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")
