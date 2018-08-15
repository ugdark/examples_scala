
object ListExample extends App {

  def assert(message: String, ls1: Any, ls2: Any): Unit = {
    println(message + ":ls1:[" + ls1 + "]:ls2:[" + ls2 + "]result:[" + (ls1 == ls2) + "]")
  }

  assert(
    "リストの表記は色々あり以下はイコール。",
    Seq(1, "a", 3.5),
    1 :: "a" :: 3.5 :: Nil
  )

  // init tailはなんか紛らわしい

  assert("Rangeの使い方 これだと未満", Seq(1, 2, 3), Range(1, 4))
  assert("これだと以下", Seq(1, 2, 3), 1 to 3)
  assert("これだと以下 倍数系", Seq(1, 4, 7), 1 to 9 by 3)

  assert("head", 1, Seq(1, 4, 7).head)
  assert("先頭から取り除いたやつになる tail", Seq(5, 7), Seq(1, 4, 5, 7).tail.tail)

  assert("last", 7, Seq(1, 4, 7).last)
  assert("ケツから取り除いたやつになる init", Seq(1, 4), Seq(1, 4, 5, 7).init.init)

}
