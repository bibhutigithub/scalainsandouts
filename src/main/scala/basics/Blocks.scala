package basics

/*
*
*  Blocks are combinations of expressions.
*  It can be surrounded by {}.
*  The result of the last expression of the block is the result of the overall block.
*
* */

object Blocks {
  def main(args: Array[String]): Unit = {
    val blockVal = {
      val y = 5
      y+2
    }
    println(blockVal)
  }
}
