import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import scalariform.formatter.preferences._

name := "scalax"

organization := "com.github.t3hnar"

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.13.3", "2.13.0", "2.12.10")

scalacOptions ++= Seq(
  "-deprecation"
)

scalacOptions --= Seq(
  "-Xlint:nullary-override"
)

licenses := Seq(("Apache License, Version 2.0", url("http://www.apache.org/licenses/LICENSE-2.0")))

homepage := Some(new URL("https://github.com/t3hnar/scalax"))

libraryDependencies += "org.specs2" %% "specs2-core" % "4.10.5" % Test

organization := "com.github.t3hnar"

pomExtra := {
  <scm>
    <url>git@github.com:t3hnar/scalax.git</url>
    <developerConnection>scm:git:git@github.com:t3hnar/scalax.git</developerConnection>
    <connection>scm:git:git@github.com:t3hnar/scalax.git</connection>
  </scm>
  <developers>
    <developer>
      <id>t3hnar</id>
      <name>Yaroslav Klymko</name>
      <email>t3hnar@gmail.com</email>
    </developer>
  </developers>
}

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignParameters, true)
  .setPreference(AlignSingleLineCaseStatements, true)

coverageExcludedPackages := "com.github.t3hnar.scalax.examples.*"

publishTo := sonatypePublishToBundle.value