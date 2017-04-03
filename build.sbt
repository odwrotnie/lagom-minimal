name := "lagom-minimal"


version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % Test

libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.2.5" % "provided"

libraryDependencies += lagomScaladslApi

libraryDependencies += lagomScaladslPersistenceCassandra

libraryDependencies += lagomScaladslPubSub

libraryDependencies += lagomScaladslTestKit

// TODO Include these settings: lagomForkedTestSettings

enablePlugins(LagomScala)
