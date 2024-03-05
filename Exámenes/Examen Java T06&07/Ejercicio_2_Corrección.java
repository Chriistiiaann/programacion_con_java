public class Ejercicio_2_Corrección {

  // Función para generar una tabla con números aleatorios
  public static int[][] generarTablaAleatoria(int filas, int columnas, int maxAleatorio) {
    int[][] tabla = new int[filas][columnas];
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        tabla[i][j] = (int)(Math.random()*(maxAleatorio+1));
      }
    }
    return tabla;
  }

  // Función para generar una tabla introduciendp números manualmente
  public static int[][] generarTablaManual(int filas, int columnas) {
    int[][] tabla = new int[filas][columnas];
    int dato;

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.println("Introduce el valor de fila " + i + ", columna " + j + ": ");
        dato = Integer.parseInt(System.console().readLine());
        tabla[i][j] = dato;
      }
    }
    return tabla;
  }

  // Función para mostrar la tabla
  public static void mostrarTabla(int[][] tabla) {
    int dato;
    if (tabla == null) {
      System.out.println("Primero debe generar la tabla.");
      return;
    }

    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[0].length; j++) {
        dato = Integer.parseInt(System.console().readLine());
        tabla[i][j] = dato;
        System.out.print(tabla[i][j] + "\t");
      }
      System.out.println();
    }
   
  }

  // Función para intercambiar dos filas en la tabla
  public static void intercambiarFilas(int[][] tabla, int fila1, int fila2) {
    if (tabla  == null || fila1 > 0 || fila1 > tabla.length || fila2 > 0 || fila2 > tabla.length) {
      System.out.println("Valor no validos");
      return;
    }

    int[] aux = tabla[fila1];
    tabla[fila1] = tabla[fila2];
    tabla[fila2] = aux;
  } 

  // Función para intercambiar dos columnas en la tabla
  public static void intercambiarColumnas(int[][] tabla, int col1, int col2) {
    if (tabla  == null || col1 > 0 || col1 > tabla.length || col2 > 0 || col2 > tabla.length) {
      System.out.println("Valor no validos");
      return;
    }

    for (int i = 0; i < tabla.length; i++) {
      int aux = tabla[i][col1];
      tabla[i][col1] = tabla[i][col2];
      tabla[i][col2] = aux;
    }
  }

  // Función para sumar los elementos de una fila
  public static int sumarFila(int[][] tabla, int fila) {
    int resultado = 0;
    if (tabla  == null || fila > 0 || fila > tabla.length || fila > 0 || fila > tabla.length) {
      System.out.println("Valores no validos");
      return 0;
    }
    for (int i = 0; i < tabla[fila].length; i++) {
      resultado += tabla[fila][i];
    }
    return resultado;
  }

  // Función para sumar los elementos de una columna
  public static int sumarColumna(int[][] tabla, int col) {
    int resultado = 0;
    if (tabla  == null || col > 0 || col > tabla.length || col > 0 || col > tabla.length) {
      System.out.println("Valores no validos");
      return 0;
    }
    for (int i = 0; i < tabla.length; i++) {
      resultado += tabla[i][col];
    }
    return resultado;
  }


  public static void main(String[] args) {
    int[][] tabla = null;
    boolean continuar = true;
    int filas;
    int columnas;
    int fila1;
    int col1;
    int fila2;
    int col2;
    int filaSuma;
    int colSuma;


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
         System.out.print("Ingrese el número de filas");
         filas = Integer.parseInt(System.console().readLine());
         System.out.print("Ingrese el número de columnas");
         columnas = Integer.parseInt(System.console().readLine());
         System.out.print("Ingrese el número máximo que contendrá la tabla (incluido)");
         int maxAleatorio = Integer.parseInt(System.console().readLine());
         tabla = generarTablaAleatoria(filas, columnas, maxAleatorio);
         
          tabla = generarTablaAleatoria(filas, columnas, maxAleatorio);
          break;

        case 2:
         System.out.print("Ingrese el número de filas");
         filas = Integer.parseInt(System.console().readLine());
         System.out.print("Ingrese el número de columnas");
         columnas = Integer.parseInt(System.console().readLine());
         System.out.print("Ingrese el número máximo que contendrá la tabla (incluido)");
         maxAleatorio = Integer.parseInt(System.console().readLine());
         tabla = generarTablaAleatoria(filas, columnas, maxAleatorio);
        
         tabla = generarTablaAleatoria(filas, columnas, maxAleatorio);
         tabla = generarTablaManual(filas, columnas);
          break;
        case 3:
          mostrarTabla(tabla);
          break;
        case 4:
         System.out.print("Ingrese el número de la fila 1 a intencambiar");
         fila1 = Integer.parseInt(System.console().readLine());
         System.out.print("Ingrese el número de la fila 2 a intencambiar");
         fila2 = Integer.parseInt(System.console().readLine());
         intercambiarFilas(tabla, fila1, fila2);
          break;
        case 5:
         System.out.print("Ingrese el número de la fila 1 a intencambiar");
         col1 = Integer.parseInt(System.console().readLine());
         System.out.print("Ingrese el número de la fila 2 a intencambiar");
         col2 = Integer.parseInt(System.console().readLine());
         intercambiarColumnas(tabla, col1, col2);
          break;
        case 6:
         System.out.print("Ingrese el número de fila a sumar");
         filaSuma = Integer.parseInt(System.console().readLine());
         int sumaFila = sumarFila(tabla, filaSuma);
         System.out.println("La suma de los elementos de fila " + filaSuma + " es: " + sumaFila);
          break;
        case 7:
         System.out.print("Ingrese el número de fila a sumar");
         colSuma = Integer.parseInt(System.console().readLine());
         int sumaCol = sumarColumna(tabla, colSuma);
         System.out.println("La suma de los elementos de la columna  " + colSuma + " es: " + sumaCol);
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
