package controllers

import models.MyRequest
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def cli = Action { implicit request =>
    val myRequest = MyRequest(request.headers.headers.toMap,
      request.queryString.toMap)
    Ok(Json.toJson(myRequest))
  }

}
