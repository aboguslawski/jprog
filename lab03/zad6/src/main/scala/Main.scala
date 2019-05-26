object Main extends App {
  /*
Zadanie 6.
Napisz funkcję ciąg(n: Int): Int która oblicza n-ty element ciągu C: N -> N, takiego, że:

    C(0) = 1
    C(1) = 1
    C(n) = C(n-1) + C(n-2) dla n > 1

Zadbaj, żeby definicja funkcji nie używała zmiennych oraz korzystała z rekurencji ogonowej.
*/

  val element: Int = 6

  def ciag(n: Int): Int = {
   def rekCiag(j: Int, k: Int, iter: Int): Int = {
     if(iter == n) j + k
     else (rekCiag(k, j + k, iter + 1))
   } 
   rekCiag(1, 1, 2)
  }
  println(ciag(element))
}