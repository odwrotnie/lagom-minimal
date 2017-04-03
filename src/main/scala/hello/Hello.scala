package hello

import play.api.libs.json._

case class Hello(name: String)

object Hello {
  implicit val format: Format[Hello] = Json.format
}
