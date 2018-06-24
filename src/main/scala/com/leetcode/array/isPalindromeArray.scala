package com.leetcode.array

object isPalindromeArray extends App {
  def isPalindrome(x: Int): Boolean = {
    def loop(cur: Int, rev: Int): Boolean = {
      if(cur <= rev) cur == rev | cur == rev/10
      else loop(cur/10, (rev *10 + cur % 10))
    }

    if(x < 0 | (x != 0 && x % 10 == 0)) false
    else loop(x, 0)
  }

  println(isPalindrome(123321))
}
