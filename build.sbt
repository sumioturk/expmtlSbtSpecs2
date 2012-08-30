name := "expmtlSbtSpecs2"

version := "1.0"

scalaVersion := "2.9.1"

resolvers ++= Seq(
  "Specs2 Repo" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies := Seq(
  "org.specs2" %% "specs2" % "1.11" % "test",
  "org.scala-tools.testing" %% "scalacheck" % "1.9",
  "org.mockito" % "mockito-all" % "1.9.0"
)

