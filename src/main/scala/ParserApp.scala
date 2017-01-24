import net.ruippeixotog.scalascraper.browser.JsoupBrowser

import com.typesafe.config.ConfigFactory
import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.model.Element
import net.ruippeixotog.scalascraper.util.ProxyUtils
import net.ruippeixotog.scalascraper.util.Validated._

import scala.collection.immutable.SortedMap
/**
  * Created by pavlic1 on 24/01/2017.
  */
object ParserApp extends  App {

  val browser = JsoupBrowser()
  val doc = browser.parseResource("/liste.html")

  doc >> extractor("a") |> println
}
