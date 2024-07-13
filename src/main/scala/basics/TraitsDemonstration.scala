package basics
/*
* Traits are ADT which contains certain fields and methods.
* Also it can contain default method definitions.
* A class can extend a single class but it can extend multiple traits.
* */
trait GreetPerson:
  def greet(name:String):String = {
    name
  }

class DefaultGreet extends GreetPerson

class CustomGreet(prefix:String,postfix:String) extends GreetPerson:
  override def greet(name: String): String =
    prefix+" "+name+"!! "+postfix

object TraitsDemonstration {
  def main(args: Array[String]): Unit = {
    val defaultGreet = DefaultGreet()
    val customGreet = CustomGreet("Hi","How are you?")
    println(defaultGreet.greet("Bibhuti"))
    println(customGreet.greet("Bibhuti"))
  }
}
