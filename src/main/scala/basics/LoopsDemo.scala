package basics

@main
def loopsDemo(): Unit = {
  // Simple loop
  val ints = Seq(15, 25, 39)
  for i <-ints do println(i)

  val intResults = for i<-ints do "Hello"

  println(intResults)
  // loop with index and value
  val listZipWithIndex = ints.zipWithIndex
  for (value,index) <- listZipWithIndex do println(index+"##"+value)

  // for loop with multiple lines
  for(value, index) <- listZipWithIndex
  do
    print("hello ")
    print("index is:"+index+" and value is:"+value)
    println("")

  // Multiple Generators
  for i <- 1 to 2
    j <- 'a' to 'c'
    k <- 1 to 10 by 5
    do
    println(i +"::"+j+"::"+k)

  //For loops with If statements i.e Guards
  for i <- 1 to 10
      if i%2 == 0
  do
    println(i)

  // For loops with Maps
  val myMap = Map("IN" -> "India"
                  , "USA" -> "United States Of America"
                  , "UK" -> "United Kingdom")

  for (key,value) <- myMap
  do
    println(key+"##"+value)

  // For expressions.All those above examples illustrates the usage of for loop
  // to print something which is a side effects. For expressions can be used to
  // return values.

  val numSeq = Seq(1, 2, 3 ,4, 5)
  val newSeq = for i <- numSeq
               yield
                 val newVal = i*2
                 newVal*3

  println(newSeq)
}

