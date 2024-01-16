/**
 * Generar números enteros entre [1,11)
 * 
 * @author Christian Rodríguez Lara
 */
public class Ejemplo04 {
  public static void main(String[] args) {
    double numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*10 + 1); //[1,11)
      System.out.println(numero);
    }
  }

}
