package exercises

abstract class MyList {

  /*
  head - first element of the list
  tail - remainder of the list
  isEmpty is this list Empty
  add(int) - new list with element added
  to String - a string representation of list
   */

  def head() : Int
  def tail() : MyList
  def isEmpty() : Boolean
  def add(n : Int) : MyList
  // polymorphic call
  override def toString() : String = "[" + printElements + "]"
  def printElements() : String
}

object EmptyList extends MyList {
  override def head(): Int = throw new NoSuchElementException

  override def tail(): MyList = throw new NoSuchElementException

  override def isEmpty(): Boolean = true

  override def add(n: Int): MyList = new Cons(n, EmptyList)

  override def printElements(): String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
  override def head(): Int = h

  override def tail(): MyList = t

  override def isEmpty(): Boolean = false

  override def add(n: Int): MyList = new Cons(n, this)

  override def printElements(): String = {
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
  }
}

object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, EmptyList)))
  println(list.head)
  println(list.tail.head)
  println(list.tail.tail.head)
  // println(list.tail.tail.tail.head) NoSuchElementException

  println(list.add(4).head)

  println(list.isEmpty())


  println(list.toString())

}