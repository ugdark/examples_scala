/**
  * Option型は主にnullの取扱いを担う
  * haskellではMaybeだからmaybeがよく言われる。
  *
  */
object OptionExample extends App {

  val maybeMoney: Option[Int] = Some(1000)
  //val maybeMoney: Option[Int] = None
  val message: String = maybeMoney.fold("お金もってないよ！") { money =>
    s"お金${money}円あるよ！"
  }

  val money: Int = maybeMoney.getOrElse(0)

  println(message)

  println(money)

  println(maybeMoney.toList)

  maybeMoney.foreach(target => {
    println(target)
  })

  val message2: String = maybeMoney.foldLeft("おかねもってないよ2") { (text, money) =>
    s"お金${money}円あるよ2！"
  }

  println(message2)

  val message3: String = maybeMoney.foldRight("おかねもってないよ3") { (money, text) =>
    s"お金${money}円あるよ3！"
  }

  println(message3)

  println(Some(3).fold(throw new RuntimeException)(_ * 3))

  val v1                           = Some(3)
  val v2                           = Some(5)
  val v3                           = Some(8)
  val result1: Option[Option[Int]] = v1.map(i1 => v2.map(i2 => i1 * i2))

  // 下の３つは同じ解
  val result1Simple1: Option[Int] = v1.map(i1 => v2.map(i2 => i1 * i2)).flatten
  val result1Simple2: Option[Int] = v1.flatMap(i1 => v2.map(i2 => i1 * i2))

  val resultSimple3: Option[Int] = for {
    i1 <- v1
    i2 <- v2
  } yield i1 * i2

}
