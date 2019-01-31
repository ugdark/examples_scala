
import org.openqa.selenium.chrome.ChromeDriver

import scala.collection.JavaConverters._
import scala.collection.mutable

trait Batch {

  // 同一のurlにはアクセスしないようにするため
  val checkSet: mutable.Set[String] = scala.collection.mutable.Set[String]()

  def execAreaJobLinks(driver: ChromeDriver, url: String): Unit = {

    driver.get(url)
    Thread.sleep(1000)

    val areaLinks = findAreaLinks(driver)

    println("[" + driver.findElementByCssSelector("h1 span").getText + "]:checkSetSize:[" + checkSet.size + "]: areaLinks:[" + areaLinks.size + "]")

    areaLinks
      .foreach(url => {
        if (!checkSet.contains(url)) {
          execAreaJobLinks(driver, url)
          checkSet.add(url)
        }
      })
  }

  def findAreaLinks(driver: ChromeDriver): Seq[String] = {
    // 求人が多い勤務地に検索履歴を含まないようにするので少しややこしい
    driver
      .findElementsByCssSelector("#s-left > dl > dd > ul:not(#jsi-search-history) > li > a")
      .asScala
      .map(_.getAttribute("href"))
  }
}

object SeleniumCheck extends App with Batch {

  val driver = new ChromeDriver()

  try {
    execAreaJobLinks(driver, "")
  } finally {
    driver.quit()
  }
}