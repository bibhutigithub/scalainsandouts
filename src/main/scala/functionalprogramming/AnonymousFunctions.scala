package functionalprogramming

@main
def anonymousFunctionsDemo(): Unit = {
  // Anonymous function demonstration
  // Long-Syntax
  val doubleElem = (i: Int) => i * 2
  val myList = List(5, 8, 10, 12)
  val doubleList = myList.map(doubleElem)

  // More shorter version
  val doubleList1 = myList.map(i => i * 2)

  // If we are not going to use the variable `i`
  // not more than once then we can replace it with `_`
  // Even more concise form
  val doubleList2 = myList.map(_ * 2)
  println(doubleList2)
}

