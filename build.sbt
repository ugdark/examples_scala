
lazy val commonSettings = Seq(
  version := "1.0",
  organization := "com.kokodayo",
  startYear := Some(2018),
  scalaVersion := "2.12.6",
  scalacOptions := Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Xlint",
    "-Ywarn-dead-code",
    "-Ywarn-numeric-widen",
    "-Ywarn-unused",
    "-Ywarn-unused-import",
    "-Ywarn-value-discard"
    // 警告をエラーにする（お好みに応じて）
    , "-Xfatal-warnings"
  )
)

lazy val testSettings = libraryDependencies ++= {
  Seq(
    "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"
  )
}



lazy val exampleDwangoCakeDI = Project("example-dwango-cake-di", file("example-dwango-cake-di"))
  .settings(commonSettings)

lazy val exampleTestScalaTest = Project("example-test-scalatest", file("example-test-scalatest"))
  .settings(commonSettings)
  .settings(testSettings)


lazy val exampleScalaDoc = Project("example-scaladoc", file("example-scaladoc"))
  .settings(commonSettings)
  .settings(testSettings)
  .settings(
    Seq(
      scalacOptions in(Compile, doc) := Seq("-diagrams")
    )
  )

lazy val exampleBasicCollectionSeq = Project("example-basic-collection-seq", file("example-basic-collection-seq"))
  .settings(commonSettings)

lazy val exampleBasicCollectionConvert = Project("example-basic-collection-convert", file("example-basic-collection-convert"))
  .settings(commonSettings)

lazy val exampleBasicFuture = Project("example-basic-future", file("example-basic-future"))
  .settings(commonSettings)

lazy val exampleBasicOptionEitherTry = Project("example-basic-option-either-try", file("example-basic-option-either-try"))
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

// github関係

lazy val exampleGithubPublish= Project("example-github-publish", file("example-github-publish"))
  .settings(
    name := "example-github-publish",
    version := "0.1-SNAPSHOT",
    organization := "com.example",
    scalaVersion := "2.12.6"
  )
  .settings(
    publishTo := Some(
      Resolver.file("example-github-publish", file("/path/to/mavenrepo")) // /path/to/mavenrepo は自分のlocal mavenrepoのpathを指定
        (Patterns(true, Resolver.mavenStyleBasePattern))
    )
  )

// githubをmaven repositoryとして使う例のやつ
lazy val exampleGithubPull = Project("example-github-pull", file("example-github-pull"))
  .settings(commonSettings)
  .settings(
    resolvers += "Maven Repository on Github" at "http://ugdark.github.io/mavenrepo/",
    libraryDependencies += "com.example" % "example-github-publish_2.12" % "0.1-SNAPSHOT"
  )


lazy val exampleUseCase = Project("example-use-case", file("example-use-case"))
  .settings(commonSettings)
  .settings(
    // https://mvnrepository.com/artifact/org.scalaz/scalaz-core
    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.25"
  )

lazy val exampleJVMMemory = Project("example-jvm-memory", file("example-jvm-memory"))
  .settings(commonSettings)


lazy val studyS99 = Project("study-S99", file("study-S99"))
  .settings(commonSettings)
  .settings(testSettings)
