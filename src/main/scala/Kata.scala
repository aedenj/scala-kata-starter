package kata

object ListHelper {
  def merge(l1:List[Int], l2:List[Int]) : List[Int]= {
    (l1, l2) match {
      case (Nil, Nil) => Nil
      case (x::xs, Nil) => l1
      case (Nil, y::ys) => l2
      case (x::xs, y::ys) => {
        if (x <= y) x :: merge(l1.tail, l2)
        else y :: merge(l1, l2.tail)
      }
    }
  }
}
