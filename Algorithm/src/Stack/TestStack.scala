package Stack

import scala.collection.mutable.Stack


object TestStack {
  List
  def main(args: Array[String]): Unit = {
    val stackInt = new Stack[Int]()
    println(stackInt.pop())
    stackInt.push(1)
    stackInt.push(2)
    stackInt.push(3)
    println(stackInt.peek())
    println(stackInt.pop())
    println(stackInt.peek())
  }
}
