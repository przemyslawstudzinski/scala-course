package exercises

abstract class MyList[+A] {

  /*
  head - first element of the list
  tail - remainder of the list
  isEmpty is this list Empty
  add(int) - new list with element added
  to String - a string representation of list
   */

  def head() : A
  def tail() : MyList[A]
  def isEmpty() : Boolean
  def add[B >: A](n : B) : MyList[B] // "B >: A" -> super TYPE of A
  // polymorphic call
  override def toString() : String = "[" + printElements + "]"
  def printElements() : String
}

object EmptyList extends MyList[Nothing] {
  override def head(): Nothing = throw new NoSuchElementException

  override def tail(): MyList[Nothing] = throw new NoSuchElementException

  override def isEmpty(): Boolean = true

  override def add[B >: Nothing](n: B): MyList[B] = new Cons(n, EmptyList)

  override def printElements(): String = ""
}

case class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
  override def head(): A = h

  override def tail(): MyList[A] = t

  override def isEmpty(): Boolean = false

  override def add[B >: A] (n: B): MyList[B] = new Cons(n, this)

  override def printElements(): String = {
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
  }
}

object ListTest extends App {
// Simple (Int) list tests
//  val list = new Cons(1, new Cons(2, new Cons(3, EmptyList)))
//  println(list.head)
//  println(list.tail.head)
//  println(list.tail.tail.head)
//  // println(list.tail.tail.tail.head) NoSuchElementException
//
//  println(list.add(4).head)
//
//  println(list.isEmpty())
//
//  println(list.toString())


  // Generic list tests
  val listInts : MyList[Int] = new Cons(1, new Cons(2, new Cons(3, EmptyList)))
  println(listInts.printElements())
  val stringList : MyList[String] = new Cons("Hello", new Cons("Scala", EmptyList))
  println(stringList.printElements())
}