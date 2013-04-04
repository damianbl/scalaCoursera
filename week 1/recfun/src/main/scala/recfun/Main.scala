package recfun

import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def isBalanced(input: List[Char], stack: String): Boolean = {
      def isOpen(char: Char): Boolean = '('.equals(char)
      def isClose(char: Char): Boolean = ')'.equals(char)

      if (input.isEmpty)
        stack.isEmpty
      else if (isOpen(input.head))
        isBalanced(input.tail, input.head + stack)
      else if (isClose(input.head))
        !stack.isEmpty && isBalanced(input.tail, stack.tail)
      else
        isBalanced(input.tail, stack)
    }

    isBalanced(chars, "")
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def ways(change: List[Int], size: Int, capacity: Int): Int = {
      if (capacity == 0) 1
      else if ((capacity < 0) || (size <= 0)) 0
      else
        ways(change, size - 1, capacity) + ways(change, size, capacity - change(size - 1))
    }
    ways(coins, coins.size, money)
  }
}
