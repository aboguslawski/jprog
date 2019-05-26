object Main extends App {
  val strefy: Seq[String] = java.util.TimeZone.getAvailableIDs.toSeq

  val strefy2 = strefy
  .filter(_.startsWith("Europe"))
  .map(x => x.stripPrefix("Europe/"))
  .sortWith(_ < _)
  .sortBy(_.length)

  println(strefy2)
  
}