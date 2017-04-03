package hello

import com.lightbend.lagom.scaladsl.persistence.PersistentEntity

class HelloEntity
  extends PersistentEntity {

  override type Command = this.type
  override type Event = this.type
  override type State = this.type

  override def initialState: HelloEntity.this.type = ???

  override def behavior: Behavior = ???
}
