package Stack


class Stack[T]() {
  var list:List[T] = Nil

  def push(element: T) = {
    list = element :: list
    list
  }

  def pop(): Option[T] = {
    val x = list.headOption
    list = list match {
      case Nil => Nil
      case h::t => t
    }
    x
  }

  def peek(): Option[T] = {
    list.headOption
  }

}
