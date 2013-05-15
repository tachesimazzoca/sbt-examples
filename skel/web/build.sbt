name <<= baseDirectory(_.getName)

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "com.novocode" % "junit-interface" % "0.10-M4" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.scalatest" %% "scalatest" % "1.8" % "test"
)

artifactName := { (config:ScalaVersion, module:ModuleID, artifact:Artifact) =>
  artifact.name + "." + artifact.extension
}
