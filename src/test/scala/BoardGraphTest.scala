import org.scalatest._
import com.fl3sc0b.whitechapelai.board.BoardGraph

class BoardGraphTest extends FlatSpec {

  "squareBoxesRepository" must "have a length of 234" in {
    assert(BoardGraph.squareBoxesRepository.length == 234)
  }

  it must "contain only 7 yellow square boxes" in {
  assert(BoardGraph.squareBoxesRepository.count(x => x.yellow) == 7)
  }

  it must "contain the proper square boxes over the outside perimeter" in {
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "24.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "6.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "1,7.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "1,26.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "2.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "2,3.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "3,4,5.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "5.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "15.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "16,17.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "17,18.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "18.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "19,20.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "20,40.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "41.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "21.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "21.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "23.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "22,23.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "77.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "76,77.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "94.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "93,94.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "109.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "110,111.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "111,134,147.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "133,146,147.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "131,146.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "0.3") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "161.1*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "161.1*2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "160.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "159,160,173.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "173,195.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "194,195.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "193,194.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "184,192.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "182,183,192.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "155,182.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "170,181.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "169,181.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "180,191.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "190,191.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "190.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "176.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "188.2*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "188.2*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "164,174.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "163,174.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "162,163.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "148,162.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "112,135.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "112,113.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "95.2*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "95.2*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "59,60.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "44,59.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "43.1*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "43.1*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "44.3") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "24,25.1") == 1)
  }

  it must "contain only 7 symmetrical square boxes" in {
    assert(BoardGraph.squareBoxesRepository.filter(x => x.symmetry > -1).map(x => x.adjacentCircles).toSet.size == 7)
  }

  it must "contain any of the proper symmetrical square boxes" in {
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "188.2*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "188.2*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "43.1*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "43.1*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "58,73.1*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "58,73.1*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "84.1*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "84.1*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "95.2*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "95.2*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "98.1*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "98.1*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "161.1*0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "161.1*1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "161.1*2") == 1)
  }
}
