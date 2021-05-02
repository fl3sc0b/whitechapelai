
import com.fl3sc0b.whitechapelai.board._
import com.fl3sc0b.whitechapelai.jack._

/**
 * Example of main class
 */
object whitechapelai extends App {
  println()
  println("Welcome to whitechapelai !!")
  println("///////////////////////////")
  println()
  //val a: CircleBox = BoardGraph.getBoxFromRepository("78").asInstanceOf[CircleBox]
  //val b: CircleBox = BoardGraph.getBoxFromRepository("187").asInstanceOf[CircleBox]
  //val c: Box = BoardGraph.getBoxFromRepository("47")
  //println(c.isBoxACircle())
  //println(c.isBoxACircle("194,195.1"))
  //val a = BoardGraph.getCircleBoxFromRepository("59")
  //val b = BoardGraph.getCircleBoxFromRepository("90")

  //val path = Algorithms.getShortestPathBetweenCircleBoxes(a, b)
  //println(path mkString " => ")
  //println(HideoutAnalyzer.getMinDistanceFromRed("72"))
  //println(HideoutAnalyzer.getStdDistanceFromRed("146"))
  //println(HideoutAnalyzer.getNumberOfConnections("70"))
  //println(HideoutAnalyzer.hideoutAnalysis)
  //println(AIEngine.hideoutsOrdered.length)
  println(AIEngine.chooseHideout())
}
