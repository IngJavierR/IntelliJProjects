package ScalaProject

import javax.security.auth.callback.Callback

/**
 * Created by jrodriguez on 04/10/15.
 */
object FuncionesAnonimas {

  def unaVezPorSegundo(callback: () => Unit){
    while (true){
      callback();
      Thread sleep 1000;
    }
  }

  def main(args: Array[String]) {
    unaVezPorSegundo(() => println("Prueba temporizador"))
  }
}
