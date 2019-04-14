package lectures.part2oop

object Generics extends App {

  class MyList[+A] {
    // Use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
      A = Cat
      B = Animal
     */
  }

  class MyMap[Key, Value]

  val listOfInt = new MyList[Int]
  val listOfString = new MyList[String]

  // Generic method
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  // val emptyListOfIntegers = MyList.empty[Int]


  // Variance problem in generic types - list

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. Yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog)  ? => return list of Animals

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. CONTRAVIARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // Bounded types
  class Cage[A <: Animal] (animal: A)
  val cage = new Cage(new Dog)

  class Car
  // Error - generic type needs proper bounded type
  // val newCage = new Cage(new Car)


}
