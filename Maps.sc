import scala.collection.mutable
import scala.math._
import scala.util.matching.Regex
import scala.xml.Utility

val scores=mutable.HashMap("All"->10,"This"->"next")
scores("All")=20
scores("All")



def escapeCharacters(input:String)= {
  val r: Regex = new Regex("(?i)<[a-z][\\w0-9-]*>")
  val innerContents = r.split(input).map(Utility.escape).toList
  val tags = r.findAllIn(input).toList

  def zipInclusive(l1: List[String], l2: List[String]): List[(String, String)] = {
    (l1, l2) match {
      case (h :: tail, Nil) => (h, "") :: zipInclusive(tail, Nil)
      case (Nil, h :: tail) => ("", h) :: zipInclusive(Nil, tail)
      case (h1 :: tail1, h2 :: tail2) => (h1, h2) :: zipInclusive(tail1, tail2)
      case (Nil, Nil) => Nil
    }
  }

  zipInclusive(innerContents, tags).map {
    case (content, tag) => content + tag
  }.mkString("")
}

println(escapeCharacters("1. this is simple ()."))
var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital)
def get() {
   for(x <-0 to 9) {
     for (y <- 0 to 9) {
       if (x *10 + y == pow(y, x)) println(x+"" + y)
     }
   }
}

//  for(a<-array){
//    if(array2.hasNext)
//      op+=Utility.escape(a)+array2.next()
//    else
//      op+=Utility.escape(a)
//  }



// Find the last element of a list.
def last(list:List[Int]):Any = {
  list match{
    case head :: Nil => head
    case _:: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
}

last(List(1,2,3,4,5,6))

//Find the last but one element of a list.
def penultimateRecursive[A](list: List[A]): A = list match {
  case h :: _ :: Nil => h
  case _ :: tail     => penultimateRecursive(tail)
  case _             => throw new NoSuchElementException
}

penultimateRecursive(List("1",3,"2",3,4,4))

//Find kth element of a list
def kThElem[A](list:List[A],k: Int):A = (list,k) match{
  case (head::_,0) => head;
  case (Nil,_) => throw new NoSuchElementException()
  case (list,k) if(k>list.length-1) => throw new ArrayIndexOutOfBoundsException
  case (_::tail,k) => kThElem(tail,k= k- 1)
}

kThElem(List(1,2,3,4,5),3)

//Find the number of elements of a list.
def length[A](list:List[A]):Int = lengthRec(list,1)
def lengthRec[A](list:List[A], k:Int):Int = (list,k) match {
  case (head::Nil,k)=> k
  case (Nil,_)=> 0
  case (head::tail,k)=>lengthRec(tail,k+1)
}

length(List(1,2,3,4))

//Reverse a list.
def revList[A](list:List[A]):List[A] ={
  def revLRec[A](list1:List[A],list2:List[A]):List[A]=(list1,list2) match{
    case (Nil,list2)=>list2
    case (head::tail,list2)=>revLRec(tail,head::list2)
}
  revLRec(list,List())
}

revList(List(1,2,3,4,5))

// Find out whether a list is a palindrome.
def isPalindrome[A](list:List[A]):Boolean ={
  list == revList(list)
}

isPalindrome(List(1,2,3,4,5,4,3,2,1))

class human(eyes:Int)

class person(age:Int,name:String)extends human(2){
  val ag = age
  val nam = name
  def this(age:Int){
    this(age,"Hiii")
    print("Hiiiiiiiii")
    //super(3)

  }
  def this(){
    this(2)
  }
}



