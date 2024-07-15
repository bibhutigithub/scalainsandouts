package basics

import scala.util.Random

@main
def generateRandomNumber():Unit={
  val randomNum = Random().nextInt(10000000)
  println(randomNum)
}
