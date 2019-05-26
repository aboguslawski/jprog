object Main extends App {
  val s = Seq("a","b","a","c","a")

  def freq[A](seq: Seq[A]): Map[A,Int] = {
    seq
    .groupBy(n => identity(n))
    .map{
      case (x,y) => (x,y.size)
    }
  }

  println(freq(s))

}