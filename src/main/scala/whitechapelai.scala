
import com.fl3sc0b.whitechapelai.board._

/**
 * Example of main class
 */
object whitechapelai extends App {
  println()
  println("Welcome to whitechapelai !!")
  println("///////////////////////////")
  println()
  val a: CircleBox = BoardGraph.getBoxFromRepository("136").asInstanceOf[CircleBox]
  val b: CircleBox = BoardGraph.getBoxFromRepository("23").asInstanceOf[CircleBox]
  val c: Box = BoardGraph.getBoxFromRepository("47")
  println(c.isBoxACircle())
  println(c.isBoxACircle("194,195.1"))

  val path = Algorithms.getShortestPathBetweenCircleBoxes(a, b)
  println(path mkString " => ")
}
