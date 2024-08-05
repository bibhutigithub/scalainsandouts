package functionalprogramming
/*
* To understand the difference between methods and functions
*
* Functions :-
* Methods :-
*
* Eta-Expansion is the conversion of method type into function type.
* The process behind this is known as eta-expansion.
* It converts an expression of method type to an
* equivalent expression of function type,
* and it does so seamlessly and quietly.
*
* */
@main
def etaExpansion(): Unit = {
  println("Hello")

  def tripleIntMethod(a: Int) = a * 3
  val tripleIntFunc = (a:Int)=>a*3

  val myList = List(10, 11, 12)

  // Both are same thing.
  val tripleUpdatedMethodList = myList.map(tripleIntMethod)
  val tripleUpdatedFuncList = myList.map(tripleIntFunc)

  println(tripleUpdatedMethodList)
  println(tripleUpdatedFuncList)
}
