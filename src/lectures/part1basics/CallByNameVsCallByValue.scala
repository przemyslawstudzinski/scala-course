package lectures.part1basics

object CallByNameVsCallByValue extends App {

  def callByValue(x : Long) : Unit = {
    println("By Value: " + x)
    println("By Value: " + x)
  }

  def callByName(x : => Long) : Unit = {
    println("By Name: " + x)
    println("By Name: " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())


  // Function with error
  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  // infinite() method called and we got error
  // printFirst(infinite(), 34)

  // infinite() it was not called
  printFirst(34, infinite())
}
