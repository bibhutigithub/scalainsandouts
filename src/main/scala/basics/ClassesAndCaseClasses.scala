package basics

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

    val person = Person("Soumya","Ratha")
    println(person.firstName+" "+person.lastName)
  }
}
