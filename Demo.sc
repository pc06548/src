
case class demo(param:Int) {
}

object demo{
  val demo2 = new demo(2)
  val demo3 = new demo(3)
  def isDemo2(d:Any):Boolean =
   d match {
     case demo(2) => true
     case "Hi" => true
     case _ => false
   }

  def func = {
    println(isDemo2(demo2))
    println(isDemo2(new demo(4)))
    println(isDemo2("Hi"))
  }

}

demo.func
