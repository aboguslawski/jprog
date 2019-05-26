object Main extends App {
  
  val s = Seq(1,2,3,4,5,6,7,8,9,10)

  def subseq[A](seq: Seq[A], bIdx: Int, eIdx: Int) : Seq[A] = {
    seq.take(eIdx).drop(bIdx)
  }

  val subs = subseq(s, 3, 6)

  println(subs)
}