ThisBuild / scalaVersion := "2.13.2"

lazy val `scala-stellar-horizon-exemplar` = project
  .in(file("."))
  .settings(
    resolvers += "jitpack" at "https://jitpack.io",
    libraryDependencies ++= List(
      "com.github.synesso.scala-stellar" %% "horizon" % "0.0.1"
    )
  )
