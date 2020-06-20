package com.fl3sc0b.whitechapelai.board

class SquareBox(id: String, var ID: String, val yellow: Boolean,
                val adjacentCircles: List[String], val adjacentSquaresCount: Byte) extends Box(id){
  def computeID(): Unit = {
    ID = if (adjacentCircles.isEmpty)
      "0" + Conventions.SQUAREBOX_COUNTER_SEPARATOR.toString + adjacentSquaresCount.toString
    else
      (adjacentCircles.mkString(Conventions.CIRCLEBOX_SEPARATOR.toString) + Conventions.SQUAREBOX_COUNTER_SEPARATOR.toString
        + adjacentSquaresCount.toString)
  }
}