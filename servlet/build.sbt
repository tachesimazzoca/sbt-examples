name := "sbt-examples-servlet" 

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided",
  //"org.apache.tomcat.embed" % "tomcat-embed-core"         % "7.0.22" % "container",
  //"org.apache.tomcat.embed" % "tomcat-embed-logging-juli" % "7.0.22" % "container",
  //"org.apache.tomcat.embed" % "tomcat-embed-jasper"       % "7.0.22" % "container",
  "org.eclipse.jetty" % "jetty-webapp" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-plus"   % "9.1.0.v20131115" % "container"
)

host in container.Configuration := "0.0.0.0"

port in container.Configuration := 9000

artifactName := { (config: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "." + artifact.extension
}
