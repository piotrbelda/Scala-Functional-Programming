package part2oop

class ScalaObjects extends App {

  object Person {
    // "class"/"static"-level functionality
    val N_EYES = 2
    def canFly: Boolean = false
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(name:String) {
    // "instance"-level functionality
    val N_HANDS = 3
  }

  println(Person.N_EYES)
  // Scala object == Singleton Instance
  val x = Person
  val y = Person
  println(x == y)

  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)
  val bobbie = Person(mary,john)
  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit

}