import org.scalatest.FreeSpec

/**
  * (*) Find the last element of a list.
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  */
class Q1Spec extends FreeSpec {

  // たぶん答え一度みてるからキレイにできてる。
  def last[A](ls: List[A]): A = ls match {
    case x :: Nil => x
    case _ :: x   => last(x)
    case _        => throw new RuntimeException("empty list")
  }

  "Find the last element of a list." - {
    "正常系" in {
      assert(8 == last(List(1, 1, 2, 3, 5, 8)))
    }

    "int以外も" in {
      assert("お" == last(List("あ", "い", "う", "え", "お")))
    }

    "空の場合" in {
      assertThrows[RuntimeException] {
        last(List.empty[Int])
      }
    }

  }
}
