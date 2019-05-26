object Main extends App {
  /*Napisz funkcję jestPierwsza(n: Int): Boolean która sprawdza, 
  czy argument jest liczba pierwszą. Zadbaj o to, żeby 
  rozwiązanie nie używało zmiennych i wykorzystywało rekurencję ogonową*/

  val x = 5

  def jestPierwsza(n: Int): Boolean ={
    def pierwszaOgonowa(k: Int, i: Int): Boolean ={
      if (i*i > k) true
      else if (k % i == 0) false
      else pierwszaOgonowa(k, i + 1)
    }
    if (n < 2) false
    else pierwszaOgonowa(n, 2)

  }

  if (jestPierwsza(x)==true)
    println(x + " jest liczba pierwsza.")
  else
    println(x + " nie jest liczba pierwsza")

}