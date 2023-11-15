/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 * 
 * @author Christian Rodríguez Lara
 */
public class T05Ejercicio02 {
  public static void main(String[] args) {
    int i = 0;
    while (i <= 100) {
      i ++;
      if (i % 5 ==0) {
      System.out.println(i);
       }
    }
  }
}
