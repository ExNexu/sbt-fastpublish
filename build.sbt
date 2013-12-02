name := "sbt-fastpublish"

organization := "us.bleibinha"

version := "0.1.0-SNAPSHOT"

crossBuildingSettings

CrossBuilding.crossSbtVersions := Seq("0.12", "0.13")

sbtPlugin := true

publishMavenStyle := false
