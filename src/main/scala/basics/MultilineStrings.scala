package basics
@main
def multiLineStringsDemo():Unit={
  var mulLineString = "This is a \n new line"
  println(mulLineString)
  println("#########")

  // This includes the whitespaces before actual String
  var newString =
    """This is a
       new
       multiline
       String""""
  println("#########")

  // This a new multiline string with strip margin
  var myNewString =
    """Hello
      |This is a new
      |multi line
      |String
      |""".stripMargin
  println(myNewString)

}

