package com.fl3sc0b.whitechapelai.maths

import Numeric.Implicits._

object Statistics {
// Provided by: navicore

  def mean[T: Numeric](xs: Iterable[T]): Double = xs.sum.toDouble / xs.size

  def variance[T: Numeric](xs: Iterable[T]): Double = {
    val avg = mean(xs)

    xs.map(_.toDouble).map(a => math.pow(a - avg, 2)).sum / xs.size
  }

  def stdDev[T: Numeric](xs: Iterable[T]): Double = math.sqrt(variance(xs))

  def normalizeNumber[T: Numeric](n: T, min: T, max: T): Double = {
    (n.toDouble() - min.toDouble()) / (max - min).toDouble()
  }
}
