/**
 * Ejercicio 6
 * 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array
 * 
 * @author Christian Rodríguez Lara
 */

public class T07Ejercicio_06 {
  public static void main(String[] args) {
    int[] numero = new int[15];
    System.out.println("Introduzca los números enteros y pulse INTRO:");

    //Escritura del array
    for (int i = 0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    //Salida por pantalla del array
    for (int i = 0; i < numero.length; i++) {
      System.out.printf("%3d",numero[i]);
    }

    //Rotamos
    int aux = numero[14];
    for (int i = numero.length - 1; i > 0; i--) {
      numero[i] = numero[i - 1];
    }
    numero[0] = aux;

    //Salida por pantalla del array rotado

    for (int i : numero) {
      System.out.printf("\n%3d",numero[i]);
    }
  }
}