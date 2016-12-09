object pattern1{
  val p1= new pattern1(12,2)
  val p2 = new pattern1(13,4)
  def matcher( pat:pattern1){
    pat match{
      case pattern1(12,2)=> println("Its 12 2")
      case pattern1(13,4)=>println("Its 13 4")
      case pattern1(x,y) =>println(x,y)
    }
  }
  case class pattern1(x:Int, y:Int)

  matcher(p1)
  matcher(p2)
  matcher(pattern1(23,4))

}