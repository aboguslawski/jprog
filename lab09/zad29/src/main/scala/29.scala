import scala.io.Source

object Main extends App {
  
  val oim = Source.fromFile("ogniem-i-mieczem.txt")
  .getLines
  .toList
  .toString
  .filter(_.isLetter)
  .drop(4)
  .toLowerCase
  .sorted
  .groupBy(identity)
  .map{
    case (x, y) => (x, y.length)
  }

  //ś, ą, ó, ż, ń, ę, ć, ź, k, ł


  def histogram(proc: Int): Unit = {
    val skal = 100/proc

    println("a: " +oim
    .map{case (x,y) => (x, "*" * (y/skal))})
  }

  println(histogram(10))
}