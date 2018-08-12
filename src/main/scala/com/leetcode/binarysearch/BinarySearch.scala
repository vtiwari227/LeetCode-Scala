package com.leetcode.binarysearch

import scala.annotation.tailrec

object BinarySearch extends App {
  def binarySearch(ds: Array[Double], key: Double): Option[Int] = {
    @tailrec
    def go(lo: Int, hi: Int): Option[Int] = {
      if(lo > hi) None
      else {
        val mid: Int = lo + (hi -lo)/2
        ds(mid) match {
          case mv if (mv == key) => Some(mid)
          case mv if (mv <= key) => go(mid + 1, hi)
          case _ => go(lo, mid - 1)
        }
      }
    }
    go(0, ds.size - 1)
  }

}
