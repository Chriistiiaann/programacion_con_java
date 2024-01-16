/**
 * Segundo ejemplo de números aleatorios entre el 0 y el 10 [0,10)
 * 
 * @author Christian Rodríguez Lara
 */
public class Ejemplo02 {
  public static void main(String[] args) {
    double numero;

    for (int i = 0; i < 10; i++) {
      numero = Math.random() * 10;
      System.out.println(numero);
    }
  }
}
