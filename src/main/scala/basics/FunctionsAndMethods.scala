package basics

/**
 * Functions are the expressions which take arguments/no arguments and return results.
 *
 * Methods are similar to functions besides we use "def" keyword to define a method
 */

object FunctionsAndMethods {
  def main(args: Array[String]): Unit = {
    // On the left of => are arguments and on the right is an expression
    // involving the parameters.
    // We can name the functions as well by assigning the it to a value.
    val incrementByOne = (x:Int) => {
      (x + 1)
    }
    println(incrementByOne(1))

    // Anonymous functions with multiple parameters
    val incByTwoAndMulByTen = (y:Int)=>(x:Int) => {
      (y+2)*x
    }

    val incByTwo = incByTwoAndMulByTen(5)
    val mulBy10 = incByTwo(10)

    println(mulBy10)
    // Example of function with no arguments
    val getName = () => "Bibhuti"
    println(getName())

    // Methods definition
    def myMethod(x:Int):Int = {
      x+5
    }
    println(myMethod(5))

    // Methods with multiple parameters list
    def incrementAndMultiply(x:Int)(y:Int) = {
      (x+1)*y
    }

    println(incrementAndMultiply(5)(6))
  }
}
