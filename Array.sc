import scala.collection.mutable.ArrayBuffer


  var a = new ArrayBuffer[Int]()
  a.insert(0, -1, 2, 3, 4, 5, -3, 4, 5);
println(a)
  val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
for (j <- (1 until indexes.length).reverse) a.remove(indexes(j))
  println(indexes)

var b = new Array[Int](2);