package basics
@main
def stringInterpolation() = {
  var stadiumName = "Barbados"
  println(s"Welcome to $stadiumName")

  // To add any expression inside String.
  println(s"This is a sum expression = ${1+1}")

  // raw interpolator. It will not convert the escape characters
  println(raw"This is a \n new line \\")
}

