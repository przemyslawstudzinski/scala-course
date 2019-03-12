package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2   // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // Basic expression: operators
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3  // -= *= /=
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF is a expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)

  // LOOPS (Scala is not imperative programming language)
  var  i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // Everything in Scala is a Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue) // ()


  val aCodeBlock = { // Expression
    val y = 2
    val z = y + 1
    // The value of code block is the value of its last expression
    if (z > 2) "hello" else "goodbye"
  }

  // 1. Difference between "Hello World" and println("Hello World")
  // "Hello World" - value of type string [String]
  // println("Hello World") - expression  [Unit]

  //2.
  val someValue = {
    2 < 3 // [Boolean]
  }
  println(someValue)

  val anotherValue = {
    if(someValue) 239 else 986
    42 // [Int]
  }
  println(anotherValue)

}
