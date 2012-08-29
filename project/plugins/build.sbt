libraryDependencies ++= Seq(
    "sbt-idea-repo" at "http://mpeltonen.github.com/maven/",
    )

resolvers ++= Seq(
    "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
    )

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.2.0-SNAPSHOT")

