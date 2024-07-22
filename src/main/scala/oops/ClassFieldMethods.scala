package oops

 class Person(var firstName:String,var lastName:String):
   println("initialisation starts!!!")
   lastName = "Mohapatra"
   val fullName = firstName+" "+lastName

   def printFullName:Unit =
     println(fullName)

   printFullName
   println("initialisation ends!!!")

// Class with default parameters
class Software(var name:String = "Kafka", var port:Int=9999):
  override def toString():String= s"${name} is running on port number ${port}"

@main
def run():Unit = {
  val p = Person("Bibhuti","Mohanty")
  val kafkaSoft = Software()
  val fitNesseSoft = Software("FitNesse")
  val intelliJSoft = Software(name="IntellijIdea",port=8080)
  println(kafkaSoft)
  println(fitNesseSoft)
  println(intelliJSoft)
}