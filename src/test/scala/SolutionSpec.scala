package solution

import org.scalatest.FunSpec
import org.scalatest.Matchers._


class SolutionSpec extends FunSpec {
  describe("merge two sorted lists") {
    describe("lists: 1, 1") {
      val l1 = List(1)
      val l2 = List(1)
      val expected = List(1,1)

      it("produces 1 -> 1") {
          ListHelper.merge(l1, l2) should equal (expected)
      }
    }

    describe("lists: 1 -> 2, 3") {
      val l1 = List(1,2)
      val l2 = List(3)
      val expected = List(1,2,3)

      it("produces 1 -> 2 -> 3") {
          ListHelper.merge(l1, l2) should equal (expected)
      }
    }

    describe("lists: 1->4->7->9, 3->4->5->11->12->14") {
      val l1 = List(1,4,7,9)
      val l2 = List(3,4,5,11,12,14)
      val expected = List(1,3,4,4,5,7,9,11,12,14)

      it("produces 1->3->4->4->5->7->9->11->12->14") {
          ListHelper.merge(l1, l2) should equal (expected)
      }
    }
  }
}
