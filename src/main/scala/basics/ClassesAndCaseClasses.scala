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
  }
}
