package basic.collection.convert

import scala.compat.Platform.currentTime

/**
  * これでわかる事は
  * とりあえずMapは生成コストはかかるんだけど参照は早い
  */
object Benchmarks extends App {

  def check1 = {
    val data: Seq[(Int, Int)] = (1 to 5000000).map { num =>
      (num, num * 1000)
    }

    val executionStart2 = currentTime
    data.filter(_._1 == 4545454)
    val total2 = currentTime - executionStart2
    Console.println("[total " + total2 + "ms]")
  }

  def check2 = {
    // これだと一度array作ってからmapに変換してるのでなんか違う
    val data: Map[Int, Int] = (1 to 5000000).map { num =>
      (num, num * 1000)
    }.toMap

    val executionStart2 = currentTime
    data.get(4545454)
    val total2 = currentTime - executionStart2
    Console.println("[total " + total2 + "ms]")
  }

  check1
  check2
}
