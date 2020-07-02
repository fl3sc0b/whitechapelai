import com.fl3sc0b.whitechapelai.board.BoardGraph.circleBoxesRepository
import com.fl3sc0b.whitechapelai.board._

/**
 * Example of main class
 */
object whitechapelai extends App {
  println("Welcome to whitechapelai !!")
  println("///////////////////////////")
  (BoardGraph.oppositeBoxesConnections("9") ::: circleBoxesRepository.filter(x => x.id == "2")).map(x => x match {
    case SquareBox(_, _, _, _, _) => println("SQUARE")
    case CircleBox(_, _, _, _) => println("CIRCLE")
  })
}
