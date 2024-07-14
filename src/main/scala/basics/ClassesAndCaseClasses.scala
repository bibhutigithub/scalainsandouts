package basics

/*
*
* Case Classes instances are immutable (It's like Java beans)
* Case Classes are compared by values and not by references. (unlike classes, whose instances are compared by reference)
* This make it useful for pattern matching.
*
* */
case class Person(firstName:String, lastName:String)

class MyClass(firstName:String,lastName:String){
  def sayHello():Unit = {
    println("Hello "+firstName+" "+lastName+"!!")
  }
}

class Point(var x:Int,var y:Int):
  def move(dx:Int, dy:Int) = {
    x = x + dx
    y = y + dy
  }
  override def toString():String = {
    s"($x, $y)"
  }
end Point

object ClassesAndCaseClasses {
  def main(args: Array[String]): Unit = {
    // Scala-3 we can create object without new keyword. By using universal apply methods.
    val myClass = MyClass("Bibhuti", "Mohapatra")
    myClass.sayHello()

    val person = Person("Bibhuti","Mohapatra")
    val anotherPerson = Person("Soumya","Ratha")
    val samePerson = Person("Bibhuti","Mohapatra")

    println(person == anotherPerson)
    println(person == samePerson)

    val pointObj = Point(3, 2)
    println(pointObj)
    pointObj.move(10, 11)
    println(pointObj)
  }
}
