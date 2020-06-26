import org.scalatest._
import com.fl3sc0b.whitechapelai.board.BoardGraph

class BoardGraphTest extends FlatSpec {

  "Length of squareBoxesRepository" must "be 234" in {
    assert(BoardGraph.squareBoxesRepository.length == 234)
  }

  "Total count of yellow square boxes in squareBoxesRepository" must "be 7" in {
  assert(BoardGraph.squareBoxesRepository.filter(x => x.yellow).length == 7)
  }

}
