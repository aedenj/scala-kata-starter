package kata

import org.scalatest.FunSpec

class KataSpec extends FunSpec {
  describe("A set") {
    describe("when empty") {
      it("should have size 0") {
        assert(Set.empty.size == 0)
      }
    }
  }
}
