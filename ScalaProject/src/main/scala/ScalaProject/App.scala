package ScalaProject

import java.util.{Locale, Date}
import java.text.DateFormat._

/**
 * @author ${user.name}
 */
object App {
  
  def main (args: Array[String]) {
    println("Hello World2")
    val ahora = new Date
    val df = getDateInstance(LONG, Locale.US)
    println(df format ahora)
  }
}
