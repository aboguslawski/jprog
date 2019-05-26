object Main extends App {
  /*Napisz funkcję rekurencyjną jestPalindromem(tab: Array[Int]): Boolean, 
  która sprawdza czy tablica będąca jej argumentem jest palindromem. */
  
  val tab = Array(1, 2, 3, 2, 1)
  
  def jestPalindromem(tab: Array[Int]): Boolean={
    def ogon(tab: Array[Int], i: Int, j: Int): Boolean={
      if (tab(i) != tab(j)) false
      else if (i < j) ogon(tab, i + 1, j - 1)
      else true
    }
    ogon(tab, 0, tab.length-1)
  }

  if (jestPalindromem(tab) == true)
    println("tablica jest palindromem")
  else
    println("tablica nie jest palindromem")

  }