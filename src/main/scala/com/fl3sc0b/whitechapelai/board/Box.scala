package com.fl3sc0b.whitechapelai.board

object Conventions {
  val CIRCLEBOX_SEPARATOR: Char = ','
  val SQUAREBOX_COUNTER_SEPARATOR: Char = '.'
  val SQUAREBOX_SYMMETRY_SEPARATOR: Char = '*'
}

trait Box {
  val id: String
  def constructId: String
  override def toString: String = id
}
