ThisBuild / scalaVersion := "2.13.5"

lazy val `scala-stellar-horizon-exemplar` = project
  .in(file("."))
  .settings(
    resolvers += "jitpack" at "https://jitpack.io",
    libraryDependencies ++= List(
      "com.github.synesso.scala-stellar" %% "horizon" % "v0.0.1"
    )
  )
