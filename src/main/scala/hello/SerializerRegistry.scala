package hello

import com.lightbend.lagom.scaladsl.playjson.{JsonSerializer, JsonSerializerRegistry}
import scala.collection.immutable.Seq

object SerializerRegistry
  extends JsonSerializerRegistry {

  override def serializers: Seq[JsonSerializer[_]] = Seq(
    JsonSerializer[Hello]
  )
}
