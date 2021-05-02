package com.fl3sc0b.whitechapelai.maths

object Random {
  /**
   * Gets a random element from a ordered collection of elements whose probability is uniformly distributed
   * @param n Number of elements of the source collection
   * @return Index of the randomly selected element
   */
  def orderedProbabilityUniformlyDistributed(n: Int): Int = {
    val next = scala.util.Random.nextInt((n * n + n) / 2) + 1
    (Math.ceil(Math.sqrt(8 * next + 1) - 1) / 2).toInt - 1
  }
}
