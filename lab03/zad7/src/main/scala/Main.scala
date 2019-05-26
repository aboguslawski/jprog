object Main extends App {

/*Napisz funkcję rekurencyjną trójkąt(wys: Int): Unit, która wyświetla na ekranie trójkąt:
          1
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1
           ...

o wysokości n. Jak widać liczby stojące na brzegach trójkąta są równe 1, 
a każda stojąca „wewnątrz” jest sumą dwóch stojących „na prawo” i „na lewo” od jej pozycji, 
ale w wierszu poprzednim.*/


  def nRazy(acc: String = "", str: String, count: Int = 1): String = {
    if (count <= 0) acc
    else nRazy(acc + str, str, count - 1)
}
  def trojkat(wys: Int): Unit = {
    def rekTrojkat(kol: Int = 1, wier: Int, x: Int = 1): Unit = {
      if(kol < wier){
        print(" " + x + " ")
        rekTrojkat(kol+1, wier, x * ((wier - kol + 1) / kol))
      }
      else{
        println()
        rekTrojkat(1, wier + 1, 1)
      }

    }
    rekTrojkat(1, 1, 1)
  }

  trojkat(2)
}