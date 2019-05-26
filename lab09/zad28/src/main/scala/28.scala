import scala.io.Source

object Main extends App {
  val nazwiska = Source.fromFile("nazwiska.txt").getLines.toList.zipWithIndex

  val imionaDist = nazwiska
  .map{
    case (x, y) => (x.takeWhile(_ != ' ').toLowerCase.distinct, y)
  }
  .sortBy{
    case (x, y) => (x.length, y)
  }
  .reverse

  val imionaHead = imionaDist.map{
    case (x, y) => x
  }
  .head

  val imionaIndex = imionaDist
  .takeWhile{
    case (x, y) => x.length == imionaHead.length
  }
  .map{
    case (x, y) => y
  }

  val odp = nazwiska
  .filter{
    case (x, y) => imionaIndex.exists(_ == y)
  }
  .map{
    case (x, y) => x
  }
  .min
  
  
  println(odp)

  //println("Benurodamuxs Benurodamuxsus")
}