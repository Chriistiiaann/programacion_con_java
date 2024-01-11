public class ArrayBi01 {
  public static void main(String[] args) {
    int[][] n = new int [3][2]; //Array de 3 filas x 2 columnas

    n[0][0] = 20; //1ªFila 1ªColumna
    n[1][0] = 67; //2ªFila 1ªColumna
    n[1][1] = 33; //2ªFila 2ªColumna
    n[2][1] = 7;  //3ªFila 2ªColumna

    System.out.println("Número de filas: " + n.length);
    System.out.println("Número de columnas: " + n[0].length);
    System.out.println();
    for (int fila = 0; fila < n.length; fila++) {
      for (int columna = 0; columna < n[fila].length; columna++) {
        System.out.printf("%10d ", n[fila][columna]);
      }
      System.out.println();
    }
    
  }
}
