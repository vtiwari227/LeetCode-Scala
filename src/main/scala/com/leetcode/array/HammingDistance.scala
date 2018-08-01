package com.leetcode.array

object HammingDistance {
   def hammingDistance(x: Int, y: Int): Int = Integer.bitCount(x ^ y)
}
