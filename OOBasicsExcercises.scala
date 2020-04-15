package part2oop

object OOBasicsExcercises extends App {
  val count = new Counter(10)
  println(count.currentCount)

  println(count.increment.increment.currentCount)
  println(count.increment(3).currentCount)
}
class Writer(name:String,surname:String,val year:Int){
  def fullName():Unit=println(s"${this.name} ${this.surname}")
}
class Novel(name:String,release:Int,author:Writer){
  val authorAge=release-author.year
  def isWrittenBy(author:Writer):Boolean=author==this.author
  def copy(newYear:Int):Novel=new Novel(name,newYear,author)
}
class Counter(n:Int){
  def currentCount:Int=n
  def increment: Counter = {println("Incrementing by 1!!!");new Counter(n+1)}
  def decrement: Counter = {println("Decrementing by 1!!!");new Counter(n-1)}
  def increment(x:Int): Counter = {
    if(x<1) this
    else increment.increment(x-1)
  }
}