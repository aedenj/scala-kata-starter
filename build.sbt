ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.katas"

lazy val katas = (project in file("."))
  .settings(
    name := "Kata",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.0",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"
  )

