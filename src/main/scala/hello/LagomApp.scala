package hello

import com.lightbend.lagom.scaladsl.persistence.cassandra.CassandraPersistenceComponents
import com.lightbend.lagom.scaladsl.server._
import play.api.libs.ws.ahc.AhcWSComponents
import com.softwaremill.macwire

abstract class LagomApp(context: LagomApplicationContext)
  extends LagomApplication(context)
    with CassandraPersistenceComponents
    with AhcWSComponents {

  override lazy val lagomServer: LagomServer = LagomServer.forServices(
    bindService[LagomServiceAPI].to(new LagomService(persistentEntityRegistry))
  )

  override lazy val jsonSerializerRegistry = SerializerRegistry

  persistentEntityRegistry.register(new HelloEntity)
}
