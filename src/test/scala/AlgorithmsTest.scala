import com.fl3sc0b.whitechapelai.board.{BoardGraph, CircleBox}
import com.fl3sc0b.whitechapelai.jack.Algorithms
import org.scalatest._

// Tests for Algorithms class
// Currently tested:
//  *Methods: getAdjacentCircleBoxes and getShortestPathBetweenCircleBoxes

class AlgorithmsTest extends FlatSpec {

  "getAdjacentCircleBoxes" must "work with a two-connections node" in { // Moving to Sets to avoid any order dependency
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "81").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "80").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "118").head
    ))
  }

  it must "work with a three-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "23").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "21").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "22").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "77").head
    ))
  }

  it must "work with a four-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "43").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "24").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "25").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "44").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "59").head
    ))
  }

  it must "work with a five-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "162").head).toSet == Set[CircleBox](
        BoardGraph.circleBoxesRepository.filter(_.id == "112").head,
        BoardGraph.circleBoxesRepository.filter(_.id == "135").head,
        BoardGraph.circleBoxesRepository.filter(_.id == "148").head,
        BoardGraph.circleBoxesRepository.filter(_.id == "149").head,
        BoardGraph.circleBoxesRepository.filter(_.id == "163").head
    ))
  }

  it must "work with a six-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "67").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "51").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "52").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "53").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "65").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "66").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "84").head
    ))
  }

  it must "work with a seven-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "65").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "51").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "66").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "67").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "84").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "63").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "82").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "83").head
    ))
  }

  it must "work with an eight-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "37").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "38").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "39").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "34").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "35").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "54").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "55").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "53").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "68").head
    ))
  }

  it must "work with a nine-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "110").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "111").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "132").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "93").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "94").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "109").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "108").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "132").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "92").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "107").head
    ))
  }

  it must "work with a ten-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "96").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "78").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "97").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "115").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "116").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "59").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "60").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "95").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "114").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "112").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "113").head
    ))
  }

  it must "work with an eleven-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "138").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "139").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "164").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "174").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "163").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "136").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "149").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "137").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "114").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "113").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "135").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "148").head
    ))
  }


  it must "work with a twelve-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "92").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "75").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "76").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "77").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "90").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "94").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "91").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "93").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "107").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "109").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "108").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "110").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "132").head
    ))
  }

  it must "work with a thirteen-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "26").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "1").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "2").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "6").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "7").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "8").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "9").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "24").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "25").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "27").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "28").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "44").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "46").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "79").head
    ))
  }

  it must "work with a fourteen-connections node" in {
    assert(Algorithms.getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == "100").head).toSet == Set[CircleBox](
      BoardGraph.circleBoxesRepository.filter(_.id == "99").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "84").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "85").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "86").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "83").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "120").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "122").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "124").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "123").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "125").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "140").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "141").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "155").head,
      BoardGraph.circleBoxesRepository.filter(_.id == "170").head
    ))
  }

  "getShortestPathBetweenCircleBoxes" must "work with main street" in {
    val route = Algorithms.getShortestPathBetweenCircleBoxes(BoardGraph.getCircleBoxFromRepository("163"),
                                                             BoardGraph.getCircleBoxFromRepository("23"))
    assert(route.head == "163" && route.last == "23" && route.length == 11)
  }

  it must "work from top left to bottom right" in {
    val route = Algorithms.getShortestPathBetweenCircleBoxes(BoardGraph.getCircleBoxFromRepository("1"),
      BoardGraph.getCircleBoxFromRepository("195"))
    assert(route.head == "1" && route.last == "195" && route.length == 10)
  }

  it must "work from top right to bottom left" in {
    val route = Algorithms.getShortestPathBetweenCircleBoxes(BoardGraph.getCircleBoxFromRepository("21"),
      BoardGraph.getCircleBoxFromRepository("188"))
    assert(route.head == "21" && route.last == "188" && route.length == 11)
  }

  it must "offer same result in both directions" in {
    // Sequence generated randomly ([1-97], [98-195])
    val paths = List(("19", "152"), ("29", "135"), ("65", "141"), ("46", "157"), ("89", "109"),
                     ("39", "162"), ("97", "171"), ("87", "124"), ("20", "99"), ("62", "167"))
    paths.map(x => {
      val routeA = Algorithms.getShortestPathBetweenCircleBoxes(BoardGraph.getCircleBoxFromRepository(x._1),
        BoardGraph.getCircleBoxFromRepository(x._2))
      val routeB = Algorithms.getShortestPathBetweenCircleBoxes(BoardGraph.getCircleBoxFromRepository(x._2),
        BoardGraph.getCircleBoxFromRepository(x._1))

      assert(routeA.head == x._1 && routeA.last == x._2 && routeB.head == x._2 && routeB.last == x._1 &&
             routeA.length == routeB.length)
    })
  }

}
