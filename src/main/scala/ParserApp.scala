import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL._
/**
  * Created by pavlic1 on 24/01/2017.
  */
object ParserApp extends  App {

  val browser = JsoupBrowser()
  val doc = browser.parseResource("/liste.html")

  doc >> extractor("a") |> println
}
