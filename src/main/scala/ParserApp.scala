import net.ruippeixotog.scalascraper.browser.JsoupBrowser

/**
  * Created by pavlic1 on 24/01/2017.
  */
class ParserApp extends  App{

  val browser = JsoupBrowser()
  val doc = browser.parseFile("liste.html")
}
