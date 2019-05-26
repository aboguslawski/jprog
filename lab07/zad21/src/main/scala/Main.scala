object Main extends App {
  val s = Seq("jeden","dwa","trzy","cztery","piec","szesc","siedem","osiem","dziewiec","dziesiec")


  def remElems[A](seq: Seq[A], k: Int): Seq[A] = {
    seq.zipWithIndex.filter{
      case (a,b) => (b+1) % k != 0
    }
    .map{
      case (a,b) => a
    }
  }
  
  //.filter(x => x % 3 != 0)

  println(remElems(s,3))
}