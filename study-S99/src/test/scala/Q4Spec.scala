import org.scalatest.FreeSpec

/**
  * リストの要素数を求めます。
  * (*) Find the number of elements of a list.
  * Example:
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  */
class Q4Spec extends FreeSpec {

  def length[A](ls: List[A]): Int = ls match {
    case Nil => 0
    case _ :: x => 1 + length(x)
  }

  def length2[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1 }

  "Find the number of elements of a list." - {
    "正常系" in {
      assert(6 == length(List(1, 1, 2, 3, 5, 8)))
      assert(1 == length(List(1)))
      assert(0 == length(List()))
    }

    "解答の確認" in {
      assert(6 == length2(List(1, 1, 2, 3, 5, 8)))
      assert(1 == length2(List(1)))
      assert(0 == length2(List()))
    }

  }
}
