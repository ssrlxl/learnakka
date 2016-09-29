// give the user a nice default project!
lazy val root = project.in(file("."))

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

organization := "$organization$"


//persistLauncher in Test := false

scalacOptions ++= Seq("-deprecation", "-feature", "-Xlint")

licenses +=("MIT", url("http://opensource.org/licenses/MIT"))


libraryDependencies ++= {
	val akkaVersion = "$akka_version$"
	Seq(
   "com.typesafe.akka" %%  "akka-actor"   % akkaVersion,
    "com.typesafe.akka" %%  "akka-agent"   % akkaVersion,
    "com.typesafe.akka" %%  "akka-slf4j"   % akkaVersion,
    "com.typesafe.akka" %%  "akka-testkit" % akkaVersion  % "test",
    "org.scalatest"     %%  "scalatest"    % "2.2.6"      % "test"
)
}


