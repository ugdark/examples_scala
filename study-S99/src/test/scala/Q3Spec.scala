import org.scalatest.FreeSpec

/**
  * リストのK番目の要素を返す
  * (*) Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  * Example:
  *
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */
class Q3Spec extends FreeSpec {

  def nth[A](index:Int, ls: List[A]): A = {
    ls(index)
  }

  // 解答より
//  def nth[A](n: Int, ls: List[A]): A = (n, ls) match {
//    case (0, h :: _)    => h
//    case (n, _ :: tail) => nth(n - 1, tail)
//    case (_, Nil)       => throw new NoSuchElementException
//  }

  "Find the Kth element of a list." - {
    "正常系" in {
      assert(2 == nth(2, List(1, 1, 2, 3, 5, 8)))
    }

//    "BigData" in {
//      assertThrows[OutOfMemoryError] {
//        nth(2, (1 to Int.MaxValue).toList)
//      }
//    }

    "indexが範囲外" in {
      assertThrows[RuntimeException] {
        nth(8, List(1, 1, 2, 3, 5, 8))
      }
    }

    "空の場合" in {
      assertThrows[RuntimeException] {
        nth(0, List())
      }
    }

  }
}
