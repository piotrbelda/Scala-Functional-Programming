package part2oop
import scala.language.postfixOps
object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int = 24){
    def likes(movie:String): Boolean = movie == favouriteMovie
    def +(person:Person):String=s"${this.name} is hanging out with ${person.name}"
    def + : Person = new Person(s"$name, the rockstar!!!",favouriteMovie)
    def unary_! : String = s"$name, what the heck??"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
    def unary_+ : Person = new Person(name,favouriteMovie,age+1)
    def learns(what: String): String = s"$name learns $what!"
    def learnsScala: String = this learns "Scala"
    def apply(howMany: Int): String = s"$name watched $favouriteMovie $howMany times!!!"
  }

  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))

  //infix notation
  println(mary likes "Inception")

  // "operators" in Scala
  val tom = new Person("Tom","Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1.+(2))

  // ALL OPERATORS ARE METHODS!!!

  //prefix notation
  val x = -1
  val y = 1.unary_-
  println(y==x)

  //unary_prefix works only with few operators: - + ~ !
  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())

  println((+mary).age)
  println(mary.learns("C++"))
  println(mary learnsScala)

  println(mary(3))
}
