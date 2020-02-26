import sbt.Package._
import sbt._

scalaVersion := "2.12.10"

libraryDependencies ++= Vector (
  Library.vertx_lang_scala,
  Library.vertx_web,
  Library.scalaTest       % "test",

  //required to get rid of some warnings emitted by the scala-compile
  Library.vertx_codegen
)

packageOptions += ManifestAttributes(
  ("Main-Verticle", "scala:vertx.scala.myapp.HttpVerticle"))

