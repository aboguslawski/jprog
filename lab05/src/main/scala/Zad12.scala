object Zad12 extends App {

  /* def isOrdered[A](seq: Seq[A])(leq: (A,A) => Boolean): Boolean = {
    // Sprawdź czy ciąg „seq” jest uporządkowany zgodnie z „leq”.
    // leq(a1,a2) oznacza, że „a1 jest mniejsze lub równe a2”
    def helper[A](a1: Int, a2: Int): Boolean = {
      if(a1 < a2) false
      else if(a2 <= seq.length) helper(a1 + 1, a2 + 1)
      else true
    }
    if(seq.length <= 1) true
    else
    helper(0, 1)
  } */

  def isOrdered[A](seq: Seq[A])(leq: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def helper(seq: Seq[A]): Boolean = seq match {
      case Seq() => true
      case Seq(_) => true
      case a1 +: a2 +: reszta if leq(a1,a2) => helper(a2 +: reszta)
      case _ => false
    }
    helper(seq)
  }
  
  println(isOrdered(Seq(1,2,3,4))((x: Int, y: Int) => x <= y))
}