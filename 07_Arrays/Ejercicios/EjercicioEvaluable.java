public class EjercicioEvaluable {
  public static void main(String[] args) {
  int fila;
  int columna;
  int[][] tabla = new int[14][3];
  int[] solucion = new int[14];

  int resultado;
  
  for (int i = 0; i < solucion.length; i++) {
    solucion[i] = resultado = (int)(Math.random()*3 + 1);
    System.out.printf("%2d", i);
    System.out.print(".|");

    switch (solucion[i]) {
      case 1:
        System.out.printf("  1");
        break;
      case 2:
        System.out.printf("  2");
        break;
      case 3:
        System.out.printf("  X");
        break;
      default:
        break;
    }
    System.out.println();
  }

    int apuesta15LS = (int)(Math.random()*4);
    
    switch (apuesta15LS) {
      case 0:
        // System.out.print("0");
        System.out.print("15.|" + "Local " + "0 ");
        break;
      case 1:
        // System.out.print("1");
        System.out.print("15.|" + "Local " + "1 ");
        break;
      case 2:
        // System.out.print("2");
        System.out.print("15.|" + "Local " + "2 ");
        break;
      case 3:
        // System.out.print("M");
        System.out.print("15.|" + "Local " + "M ");
        break;
      default:
        break;
    }
  
    // System.out.print("15.|" + "Local " + apuesta15L);
  
  
    int apuesta15VS = (int)(Math.random()*4);
    
    switch (apuesta15VS) {
      case 0:
        // System.out.print("0");
        System.out.print( "Visitante " + "0");
        break;
      case 1:
        // System.out.print("1");
        System.out.print( "Visitante " + "1");
        break;
      case 2:
        // System.out.print("2");
        System.out.print( "Visitante " + "2");
        break;
      case 3:
        // System.out.print("M");
        System.out.print( "Visitante " + "M");
        break;
      default:
        break;
    }
  

    System.out.println();
    for (int i = 0; i < 23; i++) {
      System.out.print("-");
    }
    System.out.println();


    for (fila = 0; fila < tabla.length; fila++) {
      System.out.printf("%2d", fila);
      System.out.print(".|");
      for (columna = 0; columna < tabla[fila].length; columna++) {
        resultado = (int)(Math.random()*3 + 1);
        
        switch (resultado) {
          case 1:
            System.out.printf("  1");
            break;
          case 2:
            System.out.printf("  2");
            break;
          case 3:
            System.out.printf("  X");
            break;
          default:
            break;
        }
        System.out.print("|");
      }
      System.out.println();
        
    }
  
    for (int i = 0; i < 23; i++) {
      System.out.print("-");
    }
    System.out.println();
  
    
    int apuesta15L = (int)(Math.random()*4);
    
    switch (apuesta15L) {
      case 0:
        // System.out.print("0");
        System.out.print("15.|" + "Local " + "0 ");
        break;
      case 1:
        // System.out.print("1");
        System.out.print("15.|" + "Local " + "1 ");
        break;
      case 2:
        // System.out.print("2");
        System.out.print("15.|" + "Local " + "2 ");
        break;
      case 3:
        // System.out.print("M");
        System.out.print("15.|" + "Local " + "M ");
        break;
      default:
        break;
    }
  
    // System.out.print("15.|" + "Local " + apuesta15L);
  
  
    int apuesta15V = (int)(Math.random()*4);
    
    switch (apuesta15V) {
      case 0:
        // System.out.print("0");
        System.out.print( "Visitante " + "0");
        break;
      case 1:
        // System.out.print("1");
        System.out.print( "Visitante " + "1");
        break;
      case 2:
        // System.out.print("2");
        System.out.print( "Visitante " + "2");
        break;
      case 3:
        // System.out.print("M");
        System.out.print( "Visitante " + "M");
        break;
      default:
        break;
    }
    System.out.println();
    System.out.println();
    
    
  
  

  


  }


  
}
