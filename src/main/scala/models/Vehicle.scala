package models

trait Vehicle {
  val name: String
  var fuel: Int
  var x: Int
  var y: Int
  def moveUp
  def moveDown
  def moveRight
  def moveLeft
}
