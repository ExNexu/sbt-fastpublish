import sbt._
import Keys._

object FastPublishPlugin extends Plugin {

  override lazy val settings = Seq(
    publishArtifact in (Compile, packageDoc) := false,
    publishArtifact in (Compile, packageSrc) := false
  )

}
