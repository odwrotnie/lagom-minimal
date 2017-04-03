package hello

import akka.NotUsed
import com.lightbend.lagom.scaladsl.api._
import com.lightbend.lagom.scaladsl.persistence._

import scala.concurrent.Future

trait LagomServiceAPI
  extends Service {
  def empty(): ServiceCall[NotUsed, NotUsed]
  override final def descriptor: Descriptor = {
    import Service._
    named("lagom-minimal")
      .withAutoAcl(true)
  }
}

class LagomService(persistentEntityRegistry: PersistentEntityRegistry)
  extends LagomServiceAPI {
  def empty(): ServiceCall[NotUsed, NotUsed] = ServiceCall { _ => Future.successful(NotUsed) }
}
