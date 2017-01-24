/**
  * Created by pavlic1 on 24/01/2017.
  */
object NamesApp extends App{
  import scala.io.Source
  val nanmes  = Source.fromResource("names.txt").getLines().next()

//  println(nanmes)

  val names: Array[String] = nanmes.split(",")

  val uniq = names.filter(!_.isEmpty).filter(!_.trim.isEmpty).filter(!_.contains(','))

  println(uniq.deep.mkString("\n"))
}
