package v1.post

import javax.inject.Inject

import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._

/**
 * Routes and URLs to the PostResource controller.
 */
class PostRouter @Inject()(controller: PostController) extends SimpleRouter {
  val prefix = "/v1/posts"

  def link(id: PostId): String = {
    import io.lemonlabs.uri.dsl._
    val url = prefix / id.toString
    url.toString()
  }

  override def routes: Routes = {
    // GET /v1/posts HTTP/1.1
    case GET(p"/") =>
      controller.index

    // POST http://localhost:9000/v1/posts title="hello" body="world"
    case POST(p"/") =>
      controller.process

    case GET(p"/$id") =>
      controller.show(id)
  }

}
