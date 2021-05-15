package com.fl3sc0b.whitechapelai.board

/** Models one of the circle boxes on the board.
 *
 *  @constructor Create a new circle box.
 *  @param id Name of the circle box
 *  @param number Numeric version of the name
 *  @param red true if the circle box is a red one. false otherwise
 *  @param adjacentSquares A list of square boxes names that are adjacent to this circle box
 *
 */
case class CircleBox(id: String, number: Short, red: Boolean, adjacentSquares: List[String]) extends Box{
  /** Specialized method to construct the circle box name from its members values */
  def constructId: String = number.toString
}
