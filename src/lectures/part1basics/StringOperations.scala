package lectures.part1basics

object StringOperations extends App {

  val string: String = "Hello, I am learning Scala"

  println(string.charAt(2))
  println(string.substring(7, 11))
  println(string.split(" ").toList)
  println(string.startsWith("Hello"))
  println(string.replace(" ", "-"))
  println(string.toLowerCase)
  println(string.toUpperCase)
  println(string.length)
  println(string.reverse)
  println(string.take(2))
  println()
  
  val numberString = "2"
  val number = numberString.toInt

  println('a' + numberString + 'z')

  // Scala-specific: String interpolators.

  // S interpolator
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old."
  println(greeting)
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(anotherGreeting)

  // F - interpolator
  val speed = 1.2f
  val myth = f"$name can eat $speed%1.3f burgers per minute"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
