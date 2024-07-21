package basics

@main
def controlStructuresDemo():Unit = {
  // If expression
  // Single Expression
  val x = 1
  val ifExprVal = if x == 1 then println("One")

  // Multiple lines inside If Expression
  if x == 1 then
    println("Hi")
    println("Hello")
    println("Bye")

  // If-else expressions. If-Elseif expressions
  if x == 1 then
    println("Hi")
  else
    println("Hello")

  //end-if
  if x == 1 then
    println("Hello")
  else if x == 0 then
    println("Hi")
  else
    println("Bye")
  end if

  // if expression always returns result
  def compare(a:Int, b:Int):String = {
    if a > b then
      "a is greater than b"
    else if a == b then
      "a is equal to b"
    else
      "b is greater than a"
  }

  val a = 5
  val b = 6

  val comparedValue= compare(a,b)
  println(comparedValue)

}


