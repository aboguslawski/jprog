object Main extends App {
  
  val s = Seq(1,2,1,1,5)

  def indices[A](seq: Seq[A], el: A): Set[Int] ={
  seq
  .zipWithIndex
  .map{
    case (x,y) if x==el => (x,y)
    case _ => Set()
  }
  .filter( x => x != Set())
  .map{
    case (x,y: Int) => y: Int
  }
  .toSet
  }

  println(indices(s,1))
  println(indices(s,7))
}