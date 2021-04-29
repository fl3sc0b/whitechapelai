package com.fl3sc0b.whitechapelai.board

import com.fl3sc0b.whitechapelai.maths.Statistics

object HideoutAnalyzer {
  val weights: (Double, Double, Double) = (0.6, 0.2, 1.0 - 0.6 - 0.2)

  val redCircles: List[CircleBox] = BoardGraph.circleBoxesRepository.filter(_.red)
  val possibleHideouts: List[CircleBox] = BoardGraph.circleBoxesRepository.filter(!_.red)

  val hideoutMinDist: List[Int] = possibleHideouts.map(x => getMinDistanceFromRed(x.id))
  val hideoutStdDist: List[Double] = possibleHideouts.map(x => getStdDistanceFromRed(x.id))
  val hideoutNumConn: List[Int] = possibleHideouts.map(x => getNumberOfConnections(x.id))
  val hideoutTuples: List[(Short, Double, Double, Double)] = possibleHideouts.map(x =>
    (x.number,
     1.0 - Statistics.normalizeNumber(getMinDistanceFromRed(x.id), hideoutMinDist.min, hideoutMinDist.max),
     Statistics.normalizeNumber(getStdDistanceFromRed(x.id), hideoutStdDist.min, hideoutStdDist.max),
     Statistics.normalizeNumber(getNumberOfConnections(x.id), hideoutNumConn.min, hideoutNumConn.max)
    )
  )

  val hideoutAnalysis: List[(Short, Double)] = hideoutTuples.map(x => (x._1, weights._1 * x._2 + weights._2 * x._3 + weights._3 * x._4))
                                                            .sortBy(_._2).reverse

  def getMinDistanceFromRed(id: String) : Int = {
    redCircles.map(x => Algorithms.getShortestPathBetweenCircleBoxes(BoardGraph.getCircleBoxFromRepository(id), x).
                                                                     length - 1).min
  }

  def getStdDistanceFromRed(id: String) : Double = {
    Statistics.stdDev(redCircles.map(x => Algorithms.getShortestPathBetweenCircleBoxes(BoardGraph.getCircleBoxFromRepository(id), x).
    length - 1))

  }

  def getNumberOfConnections(id: String) : Int = {
    Algorithms.getAdjacentCircleBoxes(BoardGraph.getCircleBoxFromRepository(id)).count(!_.red)
  }
}
