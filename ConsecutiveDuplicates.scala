
object Obj {
  def main(args: Array[String]) {
    val lst = List(1, 2, 1, 2, 3, 1, 1)
    println(fun(lst))

  }


  def fun(lst: List[Int]): List[List[Int]] = {
    lst match {
      case h :: t => val v = fun(t); if (!v.isEmpty && v.head == h) List(h :: v.head) else if(!v.isEmpty) List(h :: v.head) else List(List(h))
      case Nil => List.empty
    }
  }
}


