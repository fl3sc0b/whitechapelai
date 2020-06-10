import org.scalatest._

class whitechapelaiTest extends FlatSpec {

    "Method sum" must "add 1 to 1 and return 2" in {
      assert(whitechapelai.sum(1) === 2)
    }

    it must "work with zero as parameter" in {
      assert(whitechapelai.sum(0) === 1)
    }
}
