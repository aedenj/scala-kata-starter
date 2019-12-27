package solution

import org.scalatest.FunSpec
import org.scalatest.Matchers._


class SolutionSpec extends FunSpec {
  describe("A set") {
    describe("when empty") {
      it("should have size 0") {
        assert(Set.empty.size == 0)
      }
    }
  }
}
