package basics

@main
def exceptionHandlingDemo():Unit={
  val numerator = 5
  val denominator = 0

  try
    val result = numerator / denominator
    println(result)
  catch
    case e: ArithmeticException => {
      println("A number can't divided by 0!!")
      throw new Exception("A number can't divided by 0!!")
    }
  finally
    println("Always executed at last")



  println("execution ends")
}


