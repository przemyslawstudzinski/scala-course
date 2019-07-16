package lectures.part2oop

object Exceptions extends App {

  val x : String = null

  //println(x.length) // this will crash with a NPE

  // Throwing and catching exceptions

  // 1. Throwing exceptions
  // Throwable classes extend the Throwable class.
  // Exceptions and Error are the major Throwable subtypes
  //val aWeirdValue = throw new NullPointerException

  // 2. How to catch exceptions
  def getInt(withExceptions : Boolean) : Int = {
    if (withExceptions) throw new RuntimeException("No int for you!")
    else 1
  }

  //v al potentialFail =  // result of this block code
  try {
    // Code that might throw
    getInt(true)
  } catch {
    case e: RuntimeException => println("caught a runtime exception") // 43
  } finally {
    // Code that will get executed NO MATTER WHAT
    // Optional
    // Does not influence the return type of this expression
    // Use finally only for side effects
    println("finally")
  }

  // 3. How to define your own exceptions

  class MyExceptions extends Exception
  val exception = new MyExceptions
  //throw exception

  /*
    1. Crash your program with an OutOfMemoryException
    2. Crash with StackOverflowError
    3. PocketCalculator
      - add (x, y)
      - subtract (x, y)
      - multiply (x, y)
      - divide (x, y)

        Throw
          - OverflowException if add add (x, y) exceeds Int.MAX_VALUE
          - UnderflowException if subtract (x, y) exceeds Int.MIN_VALUE
          - MathCalculateException for division by 0
   */

    //OutOfMemoryException
    //val array = Array.ofDim(Int.MaxValue) // Crash the JVM

    //StackOverflowError
    //def infinity : Int = 1 + infinity
    //val noLimit = infinity

    class OverflowException extends RuntimeException
    class UnderflowException extends RuntimeException
    class MathCalculationException extends RuntimeException

    object PocketCalculator {
      def add (x: Int, y: Int) : Int = {
        val result =  x + y

        if (x > 0 && y > 0 && result < 0) throw new OverflowException
        else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
        else result
      }
      def subtract (x: Int, y: Int) : Int ={
        val result =  x - y
        if (x > 0 && y < 0 && result < 0) throw new OverflowException
        else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
        else result
      }
      def multiply (x: Int, y: Int) = {
        val result =  x * y
        if (x > 0 && y > 0 && result < 0) throw new OverflowException
        else if (x < 0 && y < 0 && result < 0) throw new OverflowException
        else if (x > 0 && y < 0 && result > 0) throw new UnderflowException
        else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
        else result
      }

      def divide (x: Int, y: Int) = {
        if(y == 0) throw new MathCalculationException
        else x / y
      }
    }

    //println(PocketCalculator.add(Int.MaxValue, 10))
    //println(PocketCalculator.divide(2, 0))


}
