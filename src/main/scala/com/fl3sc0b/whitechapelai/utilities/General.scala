package com.fl3sc0b.whitechapelai.utilities

/** Provides a set of auxiliary methods */
object General {
  /** Checks if a generic sequence is sorted in ascending order
   *
   * @author Lee and Alex from stackoverflow.com
   * @param s Sequence to be checked
   * @param ord Implicit ordering criteria for type T
   * @tparam T Type of the input sequence
   * @return true if the sequence is sorted in ascending order, false otherwise
   */
  def isSorted[T](s: Seq[T])(implicit ord: Ordering[T]): Boolean = s match {
    case Seq() => true
    case Seq(_) => true
    case _ => s.sliding(2).forall { case Seq(x, y) => ord.lteq(x, y) }
  }
}
