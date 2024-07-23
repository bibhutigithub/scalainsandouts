package oops
class Member():
  var name = ""
  var age = 0

  override def toString: String = s"Person name is ${name} and he is ${age} years old"

object Member:
  def apply(name:String):Member = {
    val m = new Member()
    m.name = name
    m
  }

  def apply(name: String, age:Int): Member = {
    val m = new Member()
    m.name = name
    m.age = age
    m
  }


@main
def companionObjectFactoryDriver():Unit={
  val m1 = Member("Bibhuti")
  val m2 = Member("Soumya", 35)
  println(m1)
  println(m2)
}
