package com.fl3sc0b.whitechapelai.board

/**
 * Models one of the square boxes on the board.
 * @param id Name of the square box
 * @param yellow true if the square box is a yellow one. false otherwise
 * @param adjacentCircles A list of circle boxes names that are adjacent to this square box
 * @param adjacentSquaresCount Amount of circle boxes that are adjacent to this square box
 * @param symmetry Distinguishes this square box from others with the same base name if there were some
 */
case class SquareBox(id: String, yellow: Boolean, adjacentCircles: List[String],
                     adjacentSquaresCount: Byte, symmetry: Byte = -1) extends Box{

  /** Specialized method to construct the square box name from its members values */
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

  /**
   * Determines if this square box and the provided one belongs to the same set of symmetrical boxes
   * @param s A [[SquareBox]] to perform the test with
   * @return true if both of the [[SquareBox]]es are symmetrical. false otherwise
   */
  def isSymmetricalFrom(s: SquareBox): Boolean = {
    this.adjacentCircles == s.adjacentCircles && this.adjacentSquaresCount == s.adjacentSquaresCount &&
                            this.symmetry != s.symmetry
  }
}