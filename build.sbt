name := "ml-1"

version := "0.1"

scalaVersion := "2.11.8"

val nd4jVersion = "0.9.1"

libraryDependencies += "org.nd4j" % "nd4j-native-platform" % nd4jVersion
libraryDependencies += "org.nd4j" %% "nd4s" % nd4jVersion

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.26",
  "org.slf4j" % "slf4j-jdk14" % "1.7.26"
)
