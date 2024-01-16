
/**
 * Tercer ejemplo, genera números entre el [0,10) enteros
 * 
 * @author Christian Rodríguez Lara
 */
public class Ejemplo03 {
  public static void main(String[] args) {
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*10); //Para que de los números aleatorios enteros, debe estar entre paréntesis.
      System.out.println(numero);
    }
  }
}
