import scala.io.Source

object Main extends App {

val linie = Source.fromFile("liczby.txt").getLines.toList

val linie2 = linie
 .map{
  case x => x.sliding(1).toList.map(_.toInt)
}
.filter(x => x == x.sortWith(_ <= _))
.filter(x => x.sum % 2 == 0)

println(linie2)

}