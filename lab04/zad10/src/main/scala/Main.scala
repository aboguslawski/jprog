object Main extends App {
  /*
  Zadanie 10.
  Niech Pred[A] oznacza zbiór predykatów (własności) dla elementów typu A

  type Pred[A] = A => Boolean

  Zdefiniuj: koniunkcję, alternatywę, negację oraz implikację dla predykatów:

  def and[A](p: Pred[A], q: Pred[A]): Pred[A]
  def or[A](p: Pred[A], q: Pred[A]): Pred[A]
  def not[A](p: Pred[A]): Pred[A]
  def imp[A](p: Pred[A], q: Pred[A]): Pred[A]

  */

  type Pred[A] = A => Boolean

  val a = 5
  val b = 2

  def and[A](p: Pred[A], q: Pred[A]): Pred[A] = {
    p ++ q
  }
/*
  def or[A](p: Pred[A], q: Pred[A]): Pred[A] = {
    if(p == true || q == true) true
    else false
  }

  def not[A](p: Pred[A]): Pred[A] = {
    if(p == true) true
    else false
  }

  def imp[A](p: Pred[A], q: Pred[A]): Pred[A] = {
    if(p == true && q == true) false
    else if(p == false && q == false) false
    else true
  } */

  println(and(a>b)(a>b))

}