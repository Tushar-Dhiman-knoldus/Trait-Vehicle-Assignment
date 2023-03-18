# Trait-Vehicle-Assignment

## *Problem Statement* 

Create a program to illustrate the capabilities of a vehicle. Incorporate other vehicle capabilities like sailing, flying, and driving to create various types of vehicles.

For instance, you can start from here:

 trait Vehicle {
  def move: String
 }

Que 1: Consider the following vehicle types

    a Car can be driven.
    a Boat can be sailed.
    an Aeroplane can be flown.

Create a class hierarchy for the above vehicle types. The class for each vehicle must implement the correct capabilities. The move() implementation for each Vehicle class must return a String. For example, if its a Car then it should return a String "Car can be driven"

Que 2: Also, Create vehicles with the following capabilities.
a) Flying cars: can be driven and flown
b) Hovercraft: can be sailed and driven


## *Program Code For The Problem*
```

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
```

## *Test Cases For The Problem*
```
import org.scalatest.funsuite.AnyFunSuite

class TraitVehicleAssignmentTest extends AnyFunSuite {

  test("A car can be Driven") {
    val expectedValue = "A car can be Driven"
    val actualValue = Car().drive
    assert(actualValue == expectedValue)
  }

  test("A boat can be Sailed") {
    val expectedValue = "A boat can be Sailed"
    val actualValue = Boat().sailed
    assert(actualValue == expectedValue)
  }

  test("An Aeroplane can be Flown") {
    val expectedValue = "An Aeroplane can be Flown"
    val actualValue = Aeroplane().flown
    assert(actualValue == expectedValue)
  }

  test("FlyingCar can be driven and flown") {
    val expectedValueForDrive = "FlyingCar can be driven"
    val expectedValueForFlying = "FlyingCar can also be flown"
    val actualValueForDrive = FlyingCar().drive
    val actualValueForFlying = FlyingCar().flown
    assert(actualValueForDrive == expectedValueForDrive)
    assert(actualValueForFlying == expectedValueForFlying)
  }

  test("Hovercraft can be sailed and flown") {
    val expectedValueForSailed = "Hovercraft can be sailed"
    val expectedValueForDrive = "Hovercraft can also be Driven"
    val actualValueForSailed = Hovercraft().sailed
    val actualValueForDrive = Hovercraft().drive
    assert(actualValueForSailed == expectedValueForSailed)
    assert(actualValueForDrive == expectedValueForDrive)
  }
}
```

