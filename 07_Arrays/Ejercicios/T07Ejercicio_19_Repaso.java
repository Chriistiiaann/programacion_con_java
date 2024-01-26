/**
 * Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá.
 * 
 * @author Christian Rodríguez Lara
 */
public class T07Ejercicio_19_Repaso {
  public static void main(String[] args) {
    int numerosAleatorios[] = new int [12];

    for (int i = 0; i < numerosAleatorios.length; i++) {
      numerosAleatorios[i] = (int)(Math.random()*201);
    }

    System.out.println("Array Original: ");
    System.out.print("Indice ");
    for (int i = 0; i < numerosAleatorios.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < numerosAleatorios.length; i++) {
      System.out.printf("%4d", numerosAleatorios[i]);
    }

    System.out.println();
    System.out.print("Introduzca el número que desea insertar: ");
    int numeroInsertado = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición en la que desea insertar el número: ");
    int posicion = Integer.parseInt(System.console().readLine());

    for (int i = numerosAleatorios.length - 1; i > posicion; i--) {
      numerosAleatorios[i] = numerosAleatorios[i - 1];
    }

    numerosAleatorios [posicion] = numeroInsertado;

    System.out.println("Array Modificado: ");
    System.out.print("Indice ");
    for (int i = 0; i < numerosAleatorios.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < numerosAleatorios.length; i++) {
      System.out.printf("%4d", numerosAleatorios[i]);
    }

  } 
}
