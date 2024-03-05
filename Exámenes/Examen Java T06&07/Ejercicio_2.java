public class Ejercicio_2 {

  


  public static void main(String[] args) {
    
    boolean continuar = true;
    int filas = 0;
    int columnas = 0;
    int [][] tabla = new int[4][5];
    int fila1;
    int col1;
    int fila2;
    int col2;
    int filaSuma = 0;
    int colSuma;
    int maxAleatorio;

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
          /*
           * Completar
           */
         
          break;
        case 2:
          System.out.println("Introduzca un número de filas: ");
          filas = Integer.parseInt(System.console().readLine());
          System.out.println("Introduzca un número de columnas: ");
          columnas = Integer.parseInt(System.console().readLine());

          for (; filas < tabla.length; filas++) {
              System.out.print("Introduzca un numero: ");
            for (; columnas < tabla[filas].length; columnas++) {
              tabla[filas][columnas]= Integer.parseInt(System.console().readLine());
            }
          }
          break;
        case 3:
          if (tabla == null) {
            System.out.println("Primero debe generar la tabla.");
          }
          for (filas = 0; filas < tabla.length; filas++) {
            for (columnas= 0; columnas < tabla[columnas].length; columnas++) {
              System.out.printf("%8d",tabla[filas][columnas]);
            }
            System.out.println();
          }
          break;
        case 4:
          System.out.println("¿Que fila desea intercambiar por otra?");
          fila1 = Integer.parseInt(System.console().readLine());
          System.out.println("¿Por qué fila lo deseas cambiar?");
          fila2 = Integer.parseInt(System.console().readLine());

          

          

          break;
        case 5:
          /*
           * Completar t, c1,c2
           */
          
          break;
        case 6:
          System.out.println("¿Qué fila desea sumar?");
          filas = Integer.parseInt(System.console().readLine());
        
          for (; filas < tabla.length; filas++) {
            for (; columnas < tabla[filas].length; columnas++) {
              filaSuma +=filas; 
            }
          }
          break;
        case 7:
          System.out.println("¿Qué columna desea sumar?");
            columnas = Integer.parseInt(System.console().readLine());
          
          for (; filas < tabla.length; filas++) {
           for (; columnas < tabla[columnas].length; columnas++) {
            filaSuma +=columnas; 
           }
          }
          break;
        case 8:
          System.out.println("¡Gracias!");
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}
