package hello

import com.lightbend.lagom.scaladsl.api._
import com.lightbend.lagom.scaladsl.persistence._

trait LagomServiceAPI
  extends Service {
  override final def descriptor: Descriptor = {
    import Service._
    named("lagom-minimal")
      .withAutoAcl(true)
  }
}

class LagomService(persistentEntityRegistry: PersistentEntityRegistry)
  extends LagomServiceAPI {

}
