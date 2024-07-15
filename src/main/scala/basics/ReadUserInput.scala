package basics

import scala.io.StdIn

@main
def readUserInput():Unit={
  println("Type something!!!")
  var output = StdIn.readLine()
  var integerOutput = StdIn.readInt()
  println(output)
  println(integerOutput)
}

