object Zad15 extends App {

  def compress[A](seq: Seq[A]): Seq[(A, Int)] = {
    // w ciągu „seq” zastąp każdy podciąg powtarzających
    // się elementów „a...a” parą „(a, <długość podciągu>)”
    // np. compress(Seq('a','a','b','c','c','c','d','d','c'))
    // == Seq( ('a',2), ('b',1), ('c',3), ('d',2), ('c',1) )
    ???
  }

}
