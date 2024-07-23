package oops

trait CorpEmployee:
  def id:Int
  def firstName:String
  def lastName:String

class CorpEmployeeImpl extends CorpEmployee:
  override def id: Int = 1234
  override def firstName: String = "Bibhuti"
  override def lastName: String = "Mohapatra"

  override def toString: String = s"Employee details: (id: $id, firstName: $firstName, lastName: $lastName)"

trait Pet(name: String):
  def greeting: String
  def age: Int
  override def toString: String = s" I am $name, I am $age years old and I say $greeting"

class Dog(name:String, var age:Int) extends Pet(name):
  val greeting = "Whoa!!!!"

@main
def traitsDriver():Unit={
  val corpEmpl = CorpEmployeeImpl()
  println(corpEmpl)

  val d = Dog("Labrador", 10)
  println(d)
}