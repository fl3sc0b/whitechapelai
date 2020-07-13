import org.scalatest._
import com.fl3sc0b.whitechapelai.board.{Conventions, SquareBox}

class SquareBoxTest extends FlatSpec {
  "SquareBox object id" must "be generated properly even with an empty list of adjacent circle boxes" in {
    assert(SquareBox("test1",yellow = false, List.empty, 2).constructId == ("0" + Conventions.SQUAREBOX_COUNTER_SEPARATOR + "2"))
  }

  it must "be generated properly when it includes a list of adjacent circle boxes" in {
    assert(SquareBox("test2", yellow = true, List("118", "119", "120"), 2).constructId == ("118" + Conventions.CIRCLEBOX_SEPARATOR +
      "119" + Conventions.CIRCLEBOX_SEPARATOR + "120" + Conventions.SQUAREBOX_COUNTER_SEPARATOR + "2"))
  }

  it must "be generated with a default symmetry if it is not specified" in {
    assert(SquareBox("test2", yellow = true, List("118", "119", "120"), 2).symmetry == -1)
  }

  it must "be generated properly when it includes symmetry" in {
    assert(SquareBox("test3", yellow = false, List("188"), 2, 1).constructId == ("188" + Conventions.SQUAREBOX_COUNTER_SEPARATOR +
      "2" + Conventions.SQUAREBOX_SYMMETRY_SEPARATOR + "1"))
  }
}
