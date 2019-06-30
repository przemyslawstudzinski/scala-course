package lectures.part2oop

object CaseClasses extends App {

  /*
    equals, hashCode, to String
   */

  case class Person (name: String, age: Int)

  // 1. Class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  // 2. Sensible toString
  // The same output - syntactic sugar
  println(jim.toString)
  println(jim)

  // 3. Equals and hashCode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2) // true

  // 4. Case classes have copy methods
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. Case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23) // not need new word

  // 6. Case classes are serializable
  // Akka

  // 7. Case classes have extractor patterns = can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }


}
