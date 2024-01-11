/**
 * Ejercicio 5 
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * @author Christian Rodríguez Lara
 */

public class T07Ejercicio_05 {
  public static void main(String[] args) {
    int[] numero = new int[10];
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;

    System.out.println("Introduzca números enteros y pulse INTRO: ");

    for (int i = 0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());

      if (numero[i] > maximo) {
        maximo = numero[i];
      }

      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }
    
    System.out.println("Tus números son: ");
    for (int i = 0; i < numero.length; i++) {
      System.out.print(numero[i] + " ");

      if (numero[i] == maximo) {
        System.out.print(" máximo");
      }

      if (numero[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }
  }
  
}