import scala.collection.mutable
import scala.collection.mutable._
import scala.util.control._



object Rating {

  def main(args: Array[String]) {

    val words: Array[String] = scala.io.StdIn.readLine().toLowerCase().split(" ")
    val n = scala.io.StdIn.readInt()
    val result: mutable.Map[Int, Int] = mutable.Map[Int,Int]()
    for(i <- 0 to n-1) {
      val id = scala.io.StdIn.readInt()
      val review = scala.io.StdIn.readLine().toLowerCase().replace(",","").replace(".","").split(" ")
      /*for(word <-words) {
        review.count( r => r == word)
      }*/

      val count1 = words.foldLeft(0)((result, word) => {
        result + review.count( r => r == word)
      })

      if(result.contains(id)) result.put(id, result.get(id).get+ count1)
      else result.put(id, count1)
    }

    println(ListMap(result.toSeq.sortWith(_._2 < _._2):_*).keys.mkString(" "))
  }

}











object Shape {
  val array =  Array[Int](0,0,0)

  def main(args: Array[String]) {
    val array =  Array[Int](0,0,0)
    var line1: String = scala.io.StdIn.readLine()
    while(line1!="") {
      val line: Array[String] = line1.split(' ')
      val index = getShapeType(line(0).toInt, line(1).toInt, line(2).toInt, line(3).toInt)
      array(index) = array(index) + 1
      line1 = scala.io.StdIn.readLine()
    }

    println(array(0)+" "+array(1)+" "+array(2))

  }

  def getShapeType(a:Int, b:Int, c:Int, d:Int): Int = {
    if(a<0 || b<0|| c<0 || d<0)
      2
    else if(a==b && b==c && c==d && d==a)
      0
    else if(a==c && b==d)
      1
    else
      2

  }
}

object DeltaEncoding {
  def main(args: Array[String]) {
    val size: Array[Int] = scala.io.StdIn.readLine().trim.split(' ').map(_.toInt)
    val escapeToken = -128
    val result = List(size(0)) ::: size.sliding(2).map(x => if(Math.abs(x(1)-x(0)) > 127) List(escapeToken, x(1) - x(0)) else List(x(1) - x(0))).flatten.toList
    println(result.mkString(" "))
  }
}



object customerService {
  def main(args: Array[String]) {
    val x = scala.io.StdIn.readInt()
    val n = scala.io.StdIn.readInt()
    val calls = new Array[Array[Int]](n)

    val executives = ListBuffer.fill(x)(-1)
    for(i <- 0 to n - 1) {
      calls(i) = scala.io.StdIn.readLine().trim.split(' ').map(_.toInt)
    }

    val loop = new Breaks;

    for(call <- calls) {
        var callAttended = false
      loop.breakable{
        for(i <- 0 to executives.size -1) {
          if (executives(i) <= call(1)) {
            callAttended = true
            executives(i) = call(1)
            loop.break
          }
        }

        }

        if(!callAttended) {
          executives += call(1)
        }
    }

    if(executives.length - x > 0 ) println(executives.length - x)
    else println(0)

  }
}


object SumArray {
  def main(args: Array[String]) {
    val sum = scala.io.StdIn.readInt()
    val len = scala.io.StdIn.readInt()
    val diff = new Array[Int](len)
    val array = new Array[Int](len)
    var result = 0
    for(i <- 0 to len - 1) {
      array(i) = scala.io.StdIn.readInt()
    }
    var i = 0
    val x = array.exists(x => {
      diff(i) = sum - x
      i = i + 1
      diff contains(x)
    })
    if(x)
    println(1)
    else println(0)
  }
}

object Chaining {
  def main(args: Array[String]) {

  }
}