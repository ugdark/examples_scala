package exercises

import org.scalatest.FreeSpec

class Q1Spec extends FreeSpec {


//  "正常系" in {
//    val xt1 = Set(1, 2, 3)
//    val yt1 = Set(3, 2, 1)
//    assert(xt1 sameElements yt1)
//  }

  "正常系2" in {
    val xs1 = Set(3, 2, 1, 4, 5, 6, 7)
    val ys1 = Set(7, 2, 1, 4, 5, 6, 3)
    assert(xs1 sameElements ys1)
  }
}
