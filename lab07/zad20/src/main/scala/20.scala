object Main extends App {
  
  val seq = Seq(1,3,3,3,1,1,4)
  // seq -> seq2(1,3,1,4)

  def deStutter[A](seq: Seq[A]): Seq[A] = {
    seq.foldLeft(Seq[A](seq(0)))( (acc: Seq[A], el:A) => (
      if (el == acc.last) acc
      else acc :+ el
    ))
  }

  println(deStutter(seq))
}