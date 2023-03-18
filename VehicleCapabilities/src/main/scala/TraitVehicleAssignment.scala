
// Defined three Traits: Drive, Sailed, Flown
trait Drive {
  def drive: String
}

trait Sailed {
  def sailed: String
}

trait Flown {
  def flown: String
}

// Defined Classes for implementing the above Traits
case class Car() extends Drive {
  override def drive: String = "A car can be Driven"
}

case class Boat() extends Sailed {
  override def sailed: String = "A boat can be Sailed"
}

case class Aeroplane() extends Flown {
  override def flown: String = "An Aeroplane can be Flown"
}

case class FlyingCar() extends Drive with Flown {
  override def drive: String = "FlyingCar can be driven"
  override def flown: String = "FlyingCar can also be flown"
}

case class Hovercraft() extends Sailed with Drive {
  override def sailed: String = "Hovercraft can be sailed"
  override def drive: String = "Hovercraft can also be Driven"
}