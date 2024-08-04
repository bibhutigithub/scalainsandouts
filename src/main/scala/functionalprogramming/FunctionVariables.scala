package functionalprogramming

@main
def functionVariableDriver(): Unit = {
  val myList = List(5, 10, 20, 30)
  val sumFunction: (Int, Int) => Int = _ + _
  val mulFunc = (a: Int, b: Int) => a * b

  val doubleFunc = (a: Int) => a * 2
  println(sumFunction(5, 8))
  println(mulFunc(5, 8))

  // If an anonymous function takes only one parameter
  // then we can call it simply by it's name
  val doubleList = myList.map(doubleFunc)
  println(doubleList)

  val increment = (_:Int)+1
  println(increment(20))
}
