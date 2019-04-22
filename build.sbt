name := "SparkConsumer"

version := "0.1"

scalaVersion := "2.12.8"


libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.1",
  "org.apache.spark" %% "spark-streaming" % "2.4.1" 
)


