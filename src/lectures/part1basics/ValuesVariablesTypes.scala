package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 10
  println(x)
  // x = 3 Vals are immutable

  val someString: String = "Hello"
  val anotherString = "Bye"

  val aBoolean: Boolean = false
  val aChar: Char = 'X'
  val aInt: Int = x
  val aShort: Short = 1000
  val aLong: Long = 1000000000000L
  val aFloat: Float = 1.2f
  val aDouble: Double = 3.434

  var aVariable: Int = 10
  aVariable = 20

  aVariable +=1
  println(aVariable)
}
