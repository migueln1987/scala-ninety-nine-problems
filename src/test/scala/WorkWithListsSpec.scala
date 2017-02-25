import org.scalatest.FunSuite

class WorkWithListsSpec extends FunSuite {

  test("The last element of the list should be 8") {
    assert(WorkWithLists.last(List(1, 1, 2, 3, 5, 8)) == 8)
  }

  test("The last element of the list should be 13") {
    assert(WorkWithLists.last(List(4, 3, 1, 7, 4, 8, 1, 13)) == 13)
  }
}
