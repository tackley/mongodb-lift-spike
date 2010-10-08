import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) {
  val scalatoolsRelease = "Scala Tools Snapshot" at
  "http://scala-tools.org/repo-releases/"

  val liftVersion = "2.1"

  override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default" withSources,
    "net.liftweb" %% "lift-testkit" % liftVersion % "compile->default" withSources,
    "net.liftweb" %% "lift-mongodb" % liftVersion % "compile->default" withSources,
    "net.liftweb" %% "lift-mongodb-record" % liftVersion % "compile->default" withSources,
    "net.liftweb" %% "lift-record" % liftVersion % "compile->default" withSources,
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default" withSources,
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "junit" % "junit" % "4.5" % "test->default",
    "org.scala-tools.testing" % "specs" % "1.6.1" % "test->default"
  ) ++ super.libraryDependencies
}
