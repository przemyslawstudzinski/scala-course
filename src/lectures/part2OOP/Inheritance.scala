package lectures.part2OOP

object Inheritance extends App {

  // Scala - Single class inheritance
  sealed class Animal {
    val creatureType = "Wild"
    def eat = println("nomnom")
    // protected private no modifier(public)
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // Constructors
  class Person (name: String, age: Int) {
    def this (name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // Overriding
  class Dog(override val creatureType : String) extends Animal {
    // override val creatureType = "Dog"
    override def eat = {
      super.eat
      println("crunch crunch")
    }
  }

  val dog = new Dog("My dog")
  dog.eat
  println(dog.creatureType)

  // Polymorphism
  val unknowAnimal: Animal = new Dog("Animal dog")
  unknowAnimal.eat

  // Super - call parents method

  // Preventing overrides
  // 1 - final on the member
  // 2 - final of the entire class
  // 3 - seal the class = Extend class in this file, prevent extension in other file


}
