object Main extends App {
  val s = Seq(1,2,3,4,5)

  def swap[A](seq: Seq[A]): Seq[A] = {
    seq
    .sliding(2,2)
    .toList
    .flatMap{
      case List(x,y) => List(y,x)
      case x => x
    }
    .toSeq
  }
  
  

  println(swap(s))
}