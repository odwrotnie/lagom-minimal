package hello

import com.lightbend.lagom.scaladsl.api.ServiceLocator
import com.lightbend.lagom.scaladsl.api.ServiceLocator.NoServiceLocator
import com.lightbend.lagom.scaladsl.server._

class LagomLoader
  extends LagomApplicationLoader {

  override def load(context: LagomApplicationContext): LagomApplication =
    new LagomApp(context) {
      override def serviceLocator: ServiceLocator = NoServiceLocator
    }
}
