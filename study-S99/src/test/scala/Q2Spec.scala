import org.scalatest.FreeSpec

/**
  * 最後から2番目の物を返す 最後のindexを返すと勘違いした
  * (*) Find the last but one element of a list.
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */
class Q2Spec extends FreeSpec {

  def penultimate[A](ls: List[A]): A = ls match {
    case _ :: Nil      => throw new RuntimeException("one element")
    case x :: _ :: Nil => x
    case _ :: x        => penultimate(x)
    case _             => throw new RuntimeException("empty list")
  }

  "Find the last but one element of a list." - {
    "正常系" in {
      assert(5 == penultimate(List(1, 1, 2, 3, 5, 8)))
    }

    "int以外も" in {
      assert("え" == penultimate(List("あ", "い", "う", "え", "お")))
    }

    "1つの場合" in {
      assertThrows[RuntimeException] {
        penultimate(List("あ"))
      }
    }

    "空の場合" in {
      assertThrows[RuntimeException] {
        penultimate(List.empty[String])
      }
    }

  }
}
