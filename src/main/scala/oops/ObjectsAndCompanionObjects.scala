package oops

import scala.math.*

object StringUtils:
  var localField: Int = 25
  def truncate(s: String, length: Int): String = s.take(length)

//Companion Objects Demo
class Circle(radius: Double):
  def area(): Double = Circle.calculateArea(radius)

object Circle:
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)

@main
def mainDriver(): Unit = {
  println(StringUtils.localField)
  println(StringUtils.truncate("Hello World", 5))

  val circleObj = Circle(25.5)
  println(circleObj.area())
}

