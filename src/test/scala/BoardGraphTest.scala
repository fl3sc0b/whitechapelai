import org.scalatest._
import com.fl3sc0b.whitechapelai.board.BoardGraph
import com.fl3sc0b.whitechapelai.board.Utilities

class BoardGraphTest extends FlatSpec {

  "squareBoxesRepository" must "have a length of 234" in {
    assert(BoardGraph.squareBoxesRepository.length == 234)
  }

  it must "have all of its elements inside adjacentCircles in ascending order" in {
    val numCircles: List[List[Int]] = BoardGraph.squareBoxesRepository.map(x => x.adjacentCircles.map(x => x.toInt))
    assert(numCircles.forall(x => Utilities.isSorted(x)))
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

  it must "contain each of the proper symmetrical square boxes" in {
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

  it must "contain each of the selected square boxes from the first sector" in {
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "44,46.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "48,62.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "81,118.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "25,44.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "29.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "8,26,28.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "45,46,47.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "45,47,61.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "78,96.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "7,26.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "78,79.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "9,11.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "46,48.3") == 1)
  }

  it must "contain each of the selected square boxes from the second sector" in {
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "31,52.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "53,68.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "10,30.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "31,32.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "15,33,34.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "65,83.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "69,102.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "4,11,12.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "63,65,82.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "100.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "99,100,120.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "99.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "17,36,38.1") == 1)
  }

  it must "contain each of the selected square boxes from the third sector" in {
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "56,57.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "41,42,58.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "88.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "105,106,107.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "71,104.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "108,110,132.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "75,90.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "104,105,130.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "71,72,88.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "91,92,93.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "87.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "72,73,74.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "22,42.0") == 1)
  }

  it must "contain each of the selected square boxes from the fourth sector" in {
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "150.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "118.3") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "114,115,137.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "175.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "138,164.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "139,150.3") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "96,114.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "115,116.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "97,117.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "113,114.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "166,176.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "136,149.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "137,138.1") == 1)
  }

  it must "contain each of the selected square boxes from the fifth sector" in {
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "122,123.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "102,127,143.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "152,153.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "141,170.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "141,155.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "165,167.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "154,168,169,170.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "119,121.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "143.3") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "123,125.4") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "0.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "142,143.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "186,193.1") == 1)
  }

  it must "contain each of the selected square boxes from the sixth sector" in {
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "193.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "159,172.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "103,127,128.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "129,144,145.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "131.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "132,133,134.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "104,145.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "145,160.0") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "159.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "185,187.3") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "186,187.1") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "183,184.2") == 1)
    assert(BoardGraph.squareBoxesRepository.count(x => x.id == "156,157.1") == 1)
  }

  it must "have only two elements which no are connected with any circle box" in {
    val idSquares: List[String] = BoardGraph.squareBoxesRepository.map(x => x.id)
    val idAdjacentSquares: List[List[String]] = BoardGraph.circleBoxesRepository.map(x => x.adjacentSquares)
    assert(idSquares.map(x => idAdjacentSquares.count(y => y.contains(x))).count(x => x == 0) == 2)
  }

  "circleBoxesRepository" must "have a length of 195" in {
    assert(BoardGraph.circleBoxesRepository.length == 195)
  }

  it must "have proper numerical versions of the ids" in {
     assert(BoardGraph.circleBoxesRepository.forall(x => x.id.toInt == x.number))
  }

  it must "have its numerical versions of the ids in ascending order" in {
    val numCircles: List[Short] = BoardGraph.circleBoxesRepository.map(x => x.number)
    assert(Utilities.isSorted(numCircles))
  }

  it must "have all of its lists of adjacent square boxes composed of existing elements" in {
    val idSquares: List[List[String]] = BoardGraph.circleBoxesRepository.map(x => x.adjacentSquares)
    assert(idSquares.forall(x => x.forall(y => BoardGraph.squareBoxesRepository.count(z => z.id == y) == 1)))
  }

  it must "contain only 8 red circle boxes" in {
    assert(BoardGraph.circleBoxesRepository.count(x => x.red) == 8)
  }

  "connections of BoardGraph" must "have a length equal to the sum of boxes repositories" in {
    assert(BoardGraph.connections.keys.size == (234 + 195))
  }
}
