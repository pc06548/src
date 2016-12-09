package search

//SEARCH A SORTED ARRAY FOR A[i] = i
object SearchSortedArrForA_i {
  def main(args: Array[String]) {
    val arr = Array(0,1,3,4,5,7)
    println(SearchSortedArrRec(arr,0,arr.length-1))

  }
  def SearchSortedArrRec(arr:Array[Int], start:Int, end: Int): Int ={
    val mid = (start+end)/2
    if(start>end) return -1;
    if(arr(mid)==mid)
      return mid
    else if(arr(mid)>mid) return SearchSortedArrRec(arr,start,mid-1)
    else return SearchSortedArrRec(arr,mid+1,end)
  }
}
