/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * 
 * @author Christian Rodríguez Lara
 */
public class T05Ejercicio03 {
  public static void main(String[] args) {
    int i = 0;
    do {
      i ++;
      if (i % 5 == 0) {
        System.out.println(i);
      }
    } while (i <=100);
  }
}
