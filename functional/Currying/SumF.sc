object E3_1_SumF{
  def sum(f:Int=> Int,a:Int,b:Int) ={
    def loop(a:Int, acc:Int): Int =
      if (a>b) acc
      else loop(a+1, f(a)+acc)
    loop(a,0)
  }
  sum(x=>x,3,5)


  def sumCurry(f:Int=> Int):(Int,Int)=>Int ={
    def sumF(a:Int, b:Int): Int =
      if (a>b) 0
      else f(a)+sumF(a+1,b)
    sumF
  }

  def sumCubes = sumCurry(x=>x*x*x)

  sumCubes(2,3)

  //more way to cut short the syntax
  def optimizedSum(f:Int=> Int)(a:Int,b:Int):Int ={

      if (a>b) 0
      else f(a)+optimizedSum(f)(a+1,b)
  }

}