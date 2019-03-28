package lectures.part2OOP

object MethodNaming extends App {

  class Person (val name: String, favoriteMovie: String, val age : Int = 0) {
    def likes(movie: String) : Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the hack?!"
    def isAlive: Boolean = true
    def apply() : String = s"Hi, my name is $name and I like $favoriteMovie"
    // Exercises
    def +(str: String) : Person = new Person(s"$name ($str)", favoriteMovie)
    def unary_+() : Person = new Person(name, favoriteMovie, age + 1)
    def learns(thing : String) : String = s"$name learns $thing"
    def learnsScala = this learns "Scala"
    def apply(n: Int) : String = s"$name watched $favoriteMovie $n times"
  }

  // Infix notation = operator notation (syntactic sugar)
  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent

  // Operators in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom)) // equivalent

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS
  // Akka actors have: ! ?

  // Prefix notation
  // unary_ prefix only works with - + ~ !
  val x = -1 // Equivalent with 1.unary_-
  val y = 1.unary_-

  println(!mary)
  println(mary.unary_!)

  // Postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // Apply
  println(mary.apply())
  println(mary()) // equivalent

  /*
    1.  Overload the + operator
        mary + "the rockstar" => new person "Mary (the rockstar)"

    2.  Add an age to the Person class
        Add a unary + operator => new person with the age + 1
        +mary => mary with the age incrementer

    3.  Add a "learns" method in the Person class => "Mary learns Scala"
        Add a learnsScala method, calls learns method with "Scala".
        Use it in postfix notation.

    4.  Overload the apply method
        mary.apply(2) => "Mary watched Inception 2 times"
 */

  println((mary + "the Rockstar").apply())
  println((mary + "the Rockstar")())
  println((+mary).age)
  println(mary learns "scala")
  println(mary learnsScala)
  println(mary.apply(2))
}
