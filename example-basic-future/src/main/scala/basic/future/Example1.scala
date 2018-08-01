package basic.future

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}

/**
  * Futureを同期させる処理
  */
object Example1 extends App {

  val start = System.currentTimeMillis
  val f: Future[String] = for {
    f1res <- f1
    f2res <- f2
  } yield f1res + f2res

  def f1 = Future {
    println("Future1")
    Thread.sleep(1500)
    "f1response"
  }

  def f2 = Future {
    println("Future2")
    Thread.sleep(1000)
    "f2response"
  }

  println("future.isCompleted[" + f.isCompleted + "]") // falseになる

  f.onComplete {
    case Success(msg) => println("check:" + msg)
    case Failure(t: Throwable) => println(t.getMessage)
  }

  f.foreach { text =>
    println("Await後に表示される事があるはず")
  }

  for {
    f1result <- f1
    f2result <- f2
  } yield {
    println("aa:" + f1result)
    println("bb" + f2result)
  }

  // Awaitで待つ処理
  Await.result(f, Duration.Inf)

  println("Await実行後:" + (System.currentTimeMillis - start).toInt) // 同期されるので2500超え

  println("future.isCompleted[" + f.isCompleted + "]") // trueになる


}
