object HelloWorld {
  def addTwo(x: Int, y: Int): Int = {
    x + y
  }

  def main(args: Array[String]): Unit = {
    println("Hello World")
    println("3 + 4 = " addTwo(3, 4))
  }
}
