package models

/**
 * @author Chen Shen Nu
 * @param name
 * @param fuel
 */
case class Car(name: String, var fuel: Int) extends Vehicle {

  var x = 0
  var y = 0

  def moveUp(){
    y += 2
    fuel -= 1
  }

  def moveDown(){
    y -= 1
    fuel -= 1
  }

  def moveRight(){
    x += 1
    fuel -= 1
  }

  def moveLeft(){
    x -= 1
    fuel -= 1
  }
}
