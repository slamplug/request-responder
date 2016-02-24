package models

import play.api.libs.json.{Json, Format}

case class MyRequest(headers: Map[String, String], params: Map[String, Seq[String]])

object MyRequest {
  implicit val requestFormat: Format[MyRequest] = Json.format[MyRequest]
}

