package com.fl3sc0b.whitechapelai.board

case class CircleBox(id: String, number: Short, red: Boolean, adjacentSquares: List[String]) extends Box{
  def constructId: String = id
}
