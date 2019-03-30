package lectures.part2OOP

import scala.text.DocGroup

object AbstractDataTypes extends App {

  // Abstract class
  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit
  }

  // val animal = new Animal - abstract classes cannot instantiated
  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch") // override word is not mandatory
  }

  // Trait
  trait Carnivore {
    val preferedMeal: String = "fresh meat"
    def eat(animal: Animal) : Unit
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Crocodile"
    override def eat: Unit = println("nomnomnom")
    override def eat(animal: Animal): Unit = println(s"I'm a crocodile and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc eat dog

  // Traits vs Abstract classes
  // 1 - Traits do not have constructor parameters
  // 2 - Multiple traits may be inherited by the same class
  // 3 - Traits = behavior, Abstract class = thing
}
