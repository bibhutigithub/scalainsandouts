package basics

/*
*
*  Expressions are computable statements which always gets evaluated and returns results.
*  Unlike statements in other imperative languages everything in Scala is an expression.
*  We can output the results of expression through println statements.
*  Even the println statement is also an expression. Why it is an expression?
*  Because it can be assigned to a value.
*  Naming the results of an expression is called a value.
*  Values cannot be re-assigned.
*  Variables are values except we can re-assign them.
*
* */
object ExpressionsAndValues {
  def main(args: Array[String]): Unit = {
    println(1+1)
    //
    val value = println(2+3)
    println(value)

    var y = 5+7
    println(y)
    y = 15
    println(y)
  }
}
