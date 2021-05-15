package com.fl3sc0b.whitechapelai.jack

import com.fl3sc0b.whitechapelai.board._
import com.fl3sc0b.whitechapelai.maths.Statistics

/** Provides a collection of possible hideouts for jack ordered by a weighted score */
object HideoutAnalyzer {
  /** Put here a true to force a full recalculation with the first call or false to not doing anything */
  val RECALCULATION: Boolean = false

  /** Weights in [0, 1] interval. Order is:
   *  - Minimum distance to a red circle box
   *  - Standard deviation distance to all the red circle boxes
   *  - Number of connections with other circle boxes (the remaining to 1.0)
   */
  val weights: (Double, Double, Double) = (0.6, 0.2, 1.0 - 0.6 - 0.2)

  /** List of circle boxes that are red */
  val redCircles: List[CircleBox] = if (RECALCULATION) BoardGraph.circleBoxesRepository.filter(_.red)
  else List.empty

  /** List of circle boxes that are not red */
  val possibleHideouts: List[CircleBox] = if (RECALCULATION) BoardGraph.circleBoxesRepository.filter(!_.red)
  else List.empty

  /** List to normalize minimum distances to red circle boxes */
  val hideoutMinDist: List[Int] = if (RECALCULATION) possibleHideouts.map(x => getMinDistanceFromRed(x.id))
  else List.empty

  /** List to normalize standard deviation of distances to red circle boxes */
  val hideoutStdDist: List[Double] = if (RECALCULATION) possibleHideouts.map(x => getStdDistanceFromRed(x.id))
  else List.empty

  /** List to normalize number of connections with other circle boxes */
  val hideoutNumConn: List[Int] = if (RECALCULATION) possibleHideouts.map(x => getNumberOfConnections(x.id))
  else List.empty

  /** List of Tuples with normalized values for each possible hideout */
  val hideoutTuples: List[(Short, Double, Double, Double)] = if (RECALCULATION)
    possibleHideouts.map(x =>
      (x.number,
        1.0 - Statistics.normalizeNumber(getMinDistanceFromRed(x.id), hideoutMinDist.min, hideoutMinDist.max),
        1.0 - Statistics.normalizeNumber(getStdDistanceFromRed(x.id), hideoutStdDist.min, hideoutStdDist.max),
        Statistics.normalizeNumber(getNumberOfConnections(x.id), hideoutNumConn.min, hideoutNumConn.max)
      )
    ) else List.empty

  /** List of Tuples with the final calculated scores for each possible hideout */
  val hideoutAnalysis: List[(Short, Double)] = if (RECALCULATION)
    hideoutTuples.map(x => (x._1, weights._1 * x._2 + weights._2 * x._3 + weights._3 * x._4))
      .sortBy(_._2) else List.empty

  /**
   * Get the distance from a named circle box to the nearest red one
   *
   * @param id Name of the starting circle box
   * @return Distance from provided named circle box to the nearest red one
   */
  def getMinDistanceFromRed(id: String): Int = {
    redCircles.map(x => Algorithms.getShortestPathBetweenCircleBoxes(BoardGraph.getCircleBoxFromRepository(id), x).
      length - 1).min
  }

  /**
   * Get the standard deviation of the distance from a named circle box to all the red ones
   *
   * @param id Name of the starting circle box
   * @return Standard deviation of the distance from provided named circle box to the nearest red one
   */
  def getStdDistanceFromRed(id: String): Double = {
    Statistics.stdDev(redCircles.map(x => Algorithms.getShortestPathBetweenCircleBoxes(BoardGraph.getCircleBoxFromRepository(id), x).
      length - 1))

  }

  /**
   * Get the number of connections of a named circle box
   *
   * @param id Name of the starting circle box
   * @return Number of connections of provided named circle box
   */
  def getNumberOfConnections(id: String): Int = {
    Algorithms.getAdjacentCircleBoxes(BoardGraph.getCircleBoxFromRepository(id)).count(!_.red)
  }
}
