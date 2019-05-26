object Main extends App {
  val napis1 = "pierwszytestowynapis"
  //12
  val napis2 = "drugitestowynapis"
  //14
  val napis3 = "trzecitestowynapis"
  //13
  
  def countChars(str:String): Int ={
    str.toSet.size
  }

  println("napis1: " +countChars(napis1))
  println("napis2: " +countChars(napis2))
  println("napis3: " +countChars(napis3))
}