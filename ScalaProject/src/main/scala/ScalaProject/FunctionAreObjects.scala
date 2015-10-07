package ScalaProject

import javax.security.auth.callback.Callback

/**
 * Created by jrodriguez on 04/10/15.
 */
object FunctionAreObjects {

  def unaVezPorSegundo(callback: () => Unit){
    while (true){ callback(); Thread sleep 1000  }
  }

  def tiempoVuela(){
    println("Prueba escala callback")
  }

  def main (args: Array[String]) {
    unaVezPorSegundo(tiempoVuela)
  }

}
