
import com.fl3sc0b.whitechapelai.board._

/**
 * Example of main class
 */
object whitechapelai extends App {
  println()
  println("Welcome to whitechapelai !!")
  println("///////////////////////////")
  println()
  val a = BoardGraph.circleBoxesRepository.filter(_.id == "1").head
  val b = BoardGraph.circleBoxesRepository.filter(_.id == "195").head

  val path = Algorithms.getShortestPathBetweenCircleBoxes(a, b)
  println(path mkString " => ")
}
