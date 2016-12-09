import scala.collection.mutable.SortedSet

object Knight {
  def main(args: Array[String]) {
    var ra = Array[Array[Int]]()
    var sc = SortedSet[node]()
    var tempNode = new node(0,0,0)
    ra(tempNode.x)(tempNode.y) == tempNode.value
    sc+=tempNode
    while(sc.size>0 && sc.head.value>20){
      val temp = sc.head
      sc.remove(temp)
    }
  }
  case class node(value:Int,x:Int,y:Int) extends Ordered[node] {
    override def compare(that: node): Int = {
      if(this.value==that.value) 0
      else if(this.value>that.value) 1
      else -1
    }
  }
}
