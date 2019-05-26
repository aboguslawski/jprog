object Main extends App {
  /*
  Zadanie 9.
  Zdefiniuj następujące generyczne operacje na funkcjach:

      „złożenie”

      def compose[A,B,C](f: A => B)(g: B => C): A => C

      „iloczyn”

      def prod[A,B,C,D](f: A => C, g: B => D): (A, B) => (C, D)

      „podniesienie operatora” op: (T,T) => T

      def lift[A,T](op: (T,T) => T)(f: A => T, g: A => T): A => T

  Postaraj się wykorzystać powyższe funkcje w rozwiązaniach kolejnych dwóch zadań.
  */

  def compose[A, B, C](f: A => B)(g: B => C): A => C = {
   (a: A) => g(f(a))
  }

  def prod[A, B, C, D](f: A => C, g: B => D): (A, B) => (C, D) = {
    (x: A, y: B) => (f(x), g(y))
  }

  def lift[A, T](op: (T, T) => T)(f: A => T, g: A => T): A => T = {
    (a: A) => op(f(a), g(a))
  }

  //=====================================/

  type Pred[A] = A => Boolean

  val a = 2

  def and[A](p: Pred[A], q: Pred[A]): Pred[A] = {
    prod(p,q)
  }
  
}