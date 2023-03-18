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
