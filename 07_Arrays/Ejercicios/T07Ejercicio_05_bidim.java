/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo
 * 
 * @author Christian Rodríguez Lara
 */
public class T07Ejercicio_05_bidim {
  public static void main(String[] args) {
    int[][] tabla = new int[6][10];
    int fila;
    int columna;

    int minimo = Integer.MAX_VALUE;
    int filaMinimo;
    int columnaMinimo;

    int maximo = Integer.MIN_VALUE;
    int filaMaximo;
    int columnaMaximo;

    //Rellenar el Array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*1001);
      }
    }

 
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d",tabla[fila][columna]); 
      }
      System.out.println("");
    }

    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        if (tabla[fila][columna] > maximo) {
          maximo = tabla[fila][columna];
        }
  
        if (tabla[fila][columna] < minimo) {
          minimo = tabla[fila][columna];
        }  
      }
    }

    System.out.println("Tus números son: ");

    
  }
}
