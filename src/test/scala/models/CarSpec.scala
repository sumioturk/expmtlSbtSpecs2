package models

import org.specs2.mutable.Specification

class CarSpec extends Specification {
  "A Car" should {
    val mockCar = Car("Shelby", 10)
    "moveUp" in {
      mockCar.moveUp()
      "and comsume 1 unit of fuel and move to coordinate(0,1)" in {
        mockCar.x must_== 0
        mockCar.y must_== 1
        mockCar.fuel must_== 9
      }
    }
  }
  "A Car" should {
    val mockCar = Car("Shelby", 10)
    "moveDown" in {
      mockCar.moveDown()
      "and comsume 1 unit of fuel and move to coordinate(0,0)" in {
        mockCar.x must_== 0
        mockCar.y must_== -1
        mockCar.fuel must_== 9
      }
    }
  }
  "A Car" should {
    val mockCar = Car("Shelby", 10)
    "moveRight" in {
      mockCar.moveRight()
      "and comsume 1 unit of fuel and move to coordinate(1,0)" in {
        mockCar.x must_== 1
        mockCar.y must_== 0
        mockCar.fuel must_== 9
      }
    }
  }
  "A Car " should {
    val mockCar = Car("Shelby", 10)
    "moveLeft" in {
      mockCar.moveLeft()
      "and comsume 1 unit of fuel and move to coordinate(0,0)" in {
        mockCar.x must_== -1
        mockCar.y must_== 0
        mockCar.fuel must_== 9
      }
    }
  }
}
