import sbt.complete.Parsers.spaceDelimited

lazy val commonSettings = Seq(
  scalaVersion := "2.11.8"
)

lazy val hello = settingKey[String]("Greeting messge.")

lazy val greet = taskKey[Unit]("Print the greeting message.")

lazy val sqrt = inputKey[Unit]("Print the square root of the given arguments")

lazy val printDate = TaskKey[Unit]("print-date", "Print the current date.")

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "sbt-examples-overview",
    version := "0.1.0-SNAPSHOT"
  ).
  settings(
    hello := "Hello!",
    greet := {
      println(hello.value + " This project name is " + name.value)
    },
    sqrt := {
      val args = spaceDelimited("Usage: sqrt <double>").parsed
      args.foreach { x =>  println(math.sqrt(x.toDouble)) }
    },
    printDate := {
      println(new java.util.Date)
    }
  )
