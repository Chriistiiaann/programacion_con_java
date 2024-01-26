/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.

 * 
 * @author Christian Rodríguez Lara
 */
public class T07Ejercicio_02_bidim {
  public static void main(String[] args) {
    int tabla [] [] = new int [4][5];
    int fila;
    int columna;


    for (fila = 0; fila < tabla.length; fila++) {
      System.out.println("aaa: ");
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }

    int sumaFila;
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d",tabla[fila][columna]); 
        sumaFila += tabla[fila][columna];
      }
      System.out.printf("|%8d\n",sumaFila); //Muestro la suma de la fila y salto de línea
    }

    for (columna = 0; columna < 49; columna++) { //Es 40 pq hemos reservado anterior mente 8 espacios * 5 números da 40
      System.out.print("-");
    }
    System.out.println("");

    int sumaColumna;
    int sumaTotal = 0;
    for (columna = 0; columna < tabla[0].length; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < tabla.length; fila++) { 
        sumaColumna += tabla[fila][columna];
      }
      System.out.printf("%8d",sumaColumna);
      sumaTotal += sumaColumna;
    }
    System.out.printf("|%8d\n",sumaTotal);
    

  }
}
