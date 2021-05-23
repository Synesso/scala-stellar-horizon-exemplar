ThisBuild / scalaVersion := "2.13.6"

lazy val `scala-stellar-horizon-exemplar` = project
  .in(file("."))
  .settings(
    resolvers += "jitpack" at "https://jitpack.io",
    libraryDependencies ++= List(
      "com.github.synesso.scala-stellar" %% "horizon" % "master-SNAPSHOT"
    )
  )
