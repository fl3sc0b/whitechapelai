package com.fl3sc0b.whitechapelai.board

object Conventions {
  val CIRCLEBOX_SEPARATOR: Char = ','
  val SQUAREBOX_COUNTER_SEPARATOR: Char = '.'
}

abstract class Box(val id: String) {
  override def toString: String = id
}
