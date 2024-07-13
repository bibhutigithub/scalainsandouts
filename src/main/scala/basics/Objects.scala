package basics

/*
*
* Objects are single instances of their own definitions. Objects are singletons of their
* own class
*
* */

object IdObjects:
  private var counter:Int = 0
  def getId():Int = {
    counter = counter + 1
    counter
  }

object Objects {
  def main(args: Array[String]): Unit = {
    println(IdObjects.getId())
    println(IdObjects.getId())
  }
}
