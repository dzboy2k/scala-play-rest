name := """scala-play-rest"""
organization := "net.sandinhgame"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
  "net.logstash.logback" % "logstash-logback-encoder" % "6.2",
  "io.lemonlabs" %% "scala-uri" % "1.5.1",
  "net.codingwell" %% "scala-guice" % "4.2.6",
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "net.sandinhgame.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "net.sandinhgame.binders._"
