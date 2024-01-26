/**
 * Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él.
 * 
 * @author Christian Rodríguez Lara
 */
public class T07Ejercicio_21 {
  public static void main(String[] args) {
    int numerosAlearotios [] = new int[15];

    for (int i = 0; i < 15; i++) {
      numerosAlearotios[i] = (int)(Math.random()*501);
    }

    System.out.println("\nArray original: ");
    for (int i = 0; i < 15; i++) {
      System.out.print(numerosAlearotios[i] + " ");
    }

    for (int i = 0; i < 15; i++) {
      while (numerosAlearotios[i] %5 != 0) {
        numerosAlearotios[i]++;
      }
    }

    System.out.println("\n\nArray resultado:");
    for (int i = 0; i < 15; i++) {
      System.out.print(numerosAlearotios[i] + " ");
    }
  }
}
