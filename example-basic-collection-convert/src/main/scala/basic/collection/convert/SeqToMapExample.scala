package basic.collection.convert

object SeqToMapExample extends App {

  case class User(id: Long, name: String)

  def check1() = {
    val datastore: Seq[User] = Seq(
      User(1, "yamada"),
      User(2, "honda"),
      User(3, "kouda")
    )
    // key にidのmapを返したい
    val test: Seq[(Long, User)] = datastore.map(u => (u.id, u))
    val test2: Map[Long, User]  = datastore.map(u => (u.id, u)) toMap

    println(test)
    println(test2)

    val test3: Option[Long] = datastore.find(_.id == 2).map(u => u.id)
    println(test3)

  }

  // Seqをmapを使った時にNoneがあった場合に処理がスキップされるかを確認
  def check2() = {
    val datastore: Seq[Option[User]] = Seq(
      Some(User(1, "yamada")),
      None,
      Some(User(3, "kouda"))
    )

    datastore.foreach(_.foreach(b => println(b.name)))
  }

  check2()
}
