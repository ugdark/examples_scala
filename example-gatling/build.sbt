enablePlugins(GatlingPlugin)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "io.gatling" % "gatling-test-framework" % "2.3.1" % "test",
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.3.1" % "test"
)

// gatling-test-frameworkはGatlingを実行するためのライブラリっぽいですね。
// gatling-charts-highchartsはHighChartsというJavaScript制のチャートライブラリを
// ベースにしたGatling向けのライブラリのようです。結果のレポート表示用だと思います。