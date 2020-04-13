package part1intro

import scala.annotation.tailrec

object TailRecursionFunctions extends App {

  def concatHelper(s:String,n:Int):String={
    def concat(acc:String,n:Int):String={
      if (n<1) acc
      else concat(acc+s,n-1)
    }
    concat(s,n)
  }
  println(concatHelper("Pepe",10))

  def isPrimeTail(n:Int):Boolean={
    @tailrec
    def helper(acc:Boolean,k:Int): Boolean={
      if(!acc) {
        println(s"no need to take computations further - $n is divisible by ${k+1}")
        return acc
      }
      if(k<2) acc
      else helper(acc && !(n % k == 0), k-1)
    }
    helper(true,n-1)
  }

  def fibonacci(n:Int):Int={
    @tailrec
    def fiboHelper(n:Int,f1:Int=1,f2:Int=1):Int={
      if(n<3) f2
      else fiboHelper(n-1,f2,f1+f2)
    }
    fiboHelper(n)
  }

  println(fibonacci(7))
  println(isPrimeTail(28))
}