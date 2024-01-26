/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author Christian Rodríguez Lara
 */
public class T07Ejercicio_04_bidimRepaso {
  public static void main(String[] args) {
    int tabla[][] = new int[4][5];
    int columna;
    int fila;
    int sumaFila;
    int sumaColumna;
    int sumaTotal =0;


    //Rellenamos el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.print("Introduzca un número: ") ;
        tabla[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }

    //Mostramos el array
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d", tabla[fila][columna]);
        sumaFila += tabla[fila][columna];
      }
      System.out.printf("%8d\n", sumaFila);
      System.out.println();
    }

    for (columna = 0; columna < tabla[0].length; columna++) {
      sumaColumna = 0;
      
      for (fila = 0; fila < tabla.length; fila++) {
        sumaColumna += tabla[fila][columna];
      }
      System.out.printf("%8d",sumaColumna);
      sumaTotal += sumaColumna;
    }
    System.out.printf("%8d\n",sumaTotal);
  }
}
