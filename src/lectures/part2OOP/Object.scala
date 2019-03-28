package lectures.part2OOP

object Object {

  // Scala does not have class-level functionality

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit

  // CAMPANIONS (object + class)

  object Person {
    // static class level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // Factory method
    def apply(mother: Person, father: Person) = new Person("Bobbie")
  }

  class Person(val name: String) {
    // instance-level functionality
  }


  def main(args: Array[String]): Unit = {
    println (Person.N_EYES)
    println (Person.canFly)

    // Scala object = SINGLETON INSTANCE
    val mary = new Person ("Mary")
    val john = new Person ("John")
    println (mary == john)

    val person1 = Person
    val person2 = Person
    println (person1 == person2)

    val bobie = Person (mary, john)

  }

}
