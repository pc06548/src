package search

/**
 * write a method that takes an sorted array A and a key k and return index of 1st occurrence of k in A if not -1
 * Created by pcm1468 on 3/10/16.
 */
object SearchSortedArrForK {
  def  searchForKRec(a: Array[Int], start: Int, end:Int, k: Int): Int ={
    if(start > end) return -1
    val mid = (start+ end)/2
    if(a(mid) == k) return mid
    else if(a(mid)>k) searchForKRec(a, start, mid - 1, k)
    else searchForKRec(a,mid+1, end, k)
  }

  def main(args: Array[String]) {
    val a = Array(1,2,3,4,5,6,7)
    println(s"7 is ${searchForKRec(a,0,a.length-1,7)}")
    println(s"1 is ${searchForKRec(a,0,a.length-1,1)}")
    println(s"2 is ${searchForKRec(a,0,a.length-1,2)}")
    println(s"3 is ${searchForKRec(a,0,a.length-1,3)}")
    println(s"4 is ${searchForKRec(a,0,a.length-1,4)}")
    println(s"5 is ${searchForKRec(a,0,a.length-1,5)}")
    println(s"6 is ${searchForKRec(a,0,a.length-1,6)}")
    println(s"8 is ${searchForKRec(a,0,a.length-1,8)}")

  }
}
