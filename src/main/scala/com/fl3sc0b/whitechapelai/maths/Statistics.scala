package com.fl3sc0b.whitechapelai.maths

import Numeric.Implicits._

/** Provides a set of auxiliary methods related to Statistics */
object Statistics {
  /**
   * Calculates the mean of a collection of numbers
   * @author navicore
   * @param xs Collection of numbers
   * @tparam T Numeric type used
   * @return The computed mean
   */
  def mean[T: Numeric](xs: Iterable[T]): Double = xs.sum.toDouble / xs.size

  /**
   * Calculates the variance of a collection of numbers
   * @author navicore
   * @param xs Collection of numbers
   * @tparam T Numeric type used
   * @return The computed variance
   */
  def variance[T: Numeric](xs: Iterable[T]): Double = {
    val avg = mean(xs)

    xs.map(_.toDouble).map(a => math.pow(a - avg, 2)).sum / xs.size
  }

  /**
   * Calculates the standard deviation of a collection of numbers
   * @author navicore
   * @param xs Collection of numbers
   * @tparam T Numeric type used
   * @return The computed standard deviation
   */
  def stdDev[T: Numeric](xs: Iterable[T]): Double = math.sqrt(variance(xs))

  /**
   * Normalizes a number to a percentage, using an interval
   * @param n Number to be normalized
   * @param min Minimum value to be normalized to
   * @param max Maximum value to be normalized to
   * @tparam T Numeric type used
   * @return Number normalized to a percentage
   */
  def normalizeNumber[T: Numeric](n: T, min: T, max: T): Double = {
    (n.toDouble() - min.toDouble()) / (max - min).toDouble()
  }
}
