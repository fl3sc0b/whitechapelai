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

  def isBoxASquare(strId: String=id): Boolean = {
    strId.contains(Conventions.SQUAREBOX_COUNTER_SEPARATOR)
  }

  def isBoxACircle(strId: String=id): Boolean = {
    !isBoxASquare(strId)
  }
}


