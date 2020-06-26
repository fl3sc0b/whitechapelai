package com.fl3sc0b.whitechapelai.board

trait Box {
  val id: String
  def constructId: String
  override def toString: String = id
}
