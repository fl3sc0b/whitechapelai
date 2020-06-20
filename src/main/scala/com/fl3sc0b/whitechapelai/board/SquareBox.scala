package com.fl3sc0b.whitechapelai.board

case class SquareBox(id: String, yellow: Boolean, adjacentCircles: List[String],
                     adjacentSquaresCount: Byte, symmetry: Byte = -1) extends Box{
  def constructId: String = {
    (
      if (adjacentCircles.isEmpty) "0"
      else adjacentCircles.mkString(Conventions.CIRCLEBOX_SEPARATOR.toString)
    ) + Conventions.SQUAREBOX_COUNTER_SEPARATOR.toString + adjacentSquaresCount.toString +
    (
      if (symmetry != -1) Conventions.SQUAREBOX_SYMMETRY_SEPARATOR.toString + symmetry.toString
      else ""
    )
  }
}