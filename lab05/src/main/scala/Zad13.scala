object Zad13 extends App {

  def insertInto[A](a: A, seq: Seq[A])(leq: (A,A) => Boolean): Seq[A] = {
    // Wstaw element „a” do ciągu „seq” zgodnie z porządkiem określonym
    // przez „leq”.
    @annotation.tailrec
    def helper(a: A, seq: Seq[A], acc: Seq[A]): Seq[A] = seq match {
      case Seq() => acc :+ a
      case e1 +: reszta if leq(a,e1) => (acc :+ a) ++ seq
      case e1 +: reszta => helper(a, reszta, acc :+ e1)
    }
  helper(a, seq, Seq())
  }

  insertInto(a = 3, Seq(1,2,4,5))((x: Int, y: Int) => x <= y)
}
