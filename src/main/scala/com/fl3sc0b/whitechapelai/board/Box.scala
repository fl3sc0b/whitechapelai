package com.fl3sc0b.whitechapelai.board

/** Set of characters to represent different parts of boxes name */
object Conventions {
  /**  Character used to separate the name of [[CircleBox]]es adjacent to a [[SquareBox]] in a [[SquareBox]] name */
  val CIRCLEBOX_SEPARATOR: Char = ','
  /**  Character used to separate the list of [[CircleBox]] names from the number of [[SquareBox]]es adjacent to a [[SquareBox]] in a [[SquareBox]] name */
  val SQUAREBOX_COUNTER_SEPARATOR: Char = '.'
  /**  Character used to indicate in a [[SquareBox]] name that this [[SquareBox]] is one of its symmetries */
  val SQUAREBOX_SYMMETRY_SEPARATOR: Char = '*'
}

/** Models one of the boxes on the board */
trait Box {
  /** Name of the box */
  val id: String
  /** Virtual method to construct the box name from its members values */
  def constructId: String
  /** Generalized method: The name of a box it's actually its String representation */
  override def toString: String = id

  /**
   * Determine from a box name if it's of [[SquareBox]] type
   * @param strId Box name to test
   * @return true if it's a [[SquareBox]] name, false otherwise
   */
  def isBoxASquare(strId: String=id): Boolean = {
    strId.contains(Conventions.SQUAREBOX_COUNTER_SEPARATOR)
  }

  /**
   * Determine from a box name if it's of [[CircleBox]] type
   * @param strId Box name to test
   * @return true if it's a [[CircleBox]] name, false otherwise
   */
  def isBoxACircle(strId: String=id): Boolean = {
    !isBoxASquare(strId)
  }
}


