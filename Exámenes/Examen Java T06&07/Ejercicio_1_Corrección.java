public class Ejercicio_1_Corrección {

  public static int generaAleatorio(int min, int max){
    return (int)(Math.random()*(max - min + 1) + min);
  }

  public static void mostrarMenu(){
    System.out.print("Elige una opción\n"+
      "1. Volver a jugar. \n" +
      "2. Salir del juego.");
  }

  public static void main(String[] args) {
    int min = Integer.MAX_VALUE; //Min Introducido
    int max = Integer.MIN_VALUE; //Max Introducido
    int intervaloMin = 0;
    int intervaloMax = 0;
    int intentos;
    int numPensado;
    int respuesta;
    int opcion;
    boolean acertado = false;

    do {
      do {
        System.out.println("-D-I-V-I-N-A-R-E-M-\n" +
            "Divinarem pensará un número entre los valores que tu decidas\n"+
            "Introduzca el valor mínimo del intervalo: ");
        min = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el valor máximo del intervalo: ");
        max = Integer.parseInt(System.console().readLine());
    
        if (min >= max) {
          System.out.println("ERROR: El valor mínimo debe ser menor que el máximo.");
        }
        } while (min >= max); //Se realiza hasta que el  minimo deje de ser mayor que el  maximo
        
    
        do {
          intervaloMin = generaAleatorio(min, max);
          // System.out.print("IntervaloMin: " + intervaloMin); //Para comprobar el número que nos ofrece, será para comprobar que el código funciona
          intervaloMax = generaAleatorio(min, max);
          // System.out.print("IntervaloMax: " + intervaloMax); //Para comprobar el número que nos ofrece, será para comprobar que el código funciona
    
        } while (intervaloMin >= intervaloMax); //Se realiza hasta que el intervalo minimo deje de ser mayor que el intervalo maximo
    
        intentos = (int)(Math.log(intervaloMax-intervaloMin+1) / Math.log(2)); //Operacion para calcular el número de intentos en función del rango
    
        System.out.println("-D-I-V-I-N-A-R-E-M-\n" +
            "Estoy pensando en un número entre " + intervaloMin + " y " + intervaloMax + "\n" + 
            "Tienes " + intentos + " intentos");
            
        numPensado = generaAleatorio(intervaloMin, intervaloMax); //Número aleatorio que genera
    
        do {
          System.out.print("Escribe el número : ");
          respuesta = Integer.parseInt(System.console().readLine());
    
          if (respuesta == numPensado) {
            System.out.println("Enhorabuena!!!! has acertado.");
            acertado = true;
          } else if (respuesta < numPensado) {
            System.out.println("Te has quedado corto");
            intentos --;
          }else{
            System.out.println("Te has pasao.");
            intentos--;
          }
    
          if (intentos == 0 && !acertado) {
            System.out.println("Has superado el número de intentos.\n" + 
                "El número que había pensado era: " + numPensado);
          }
        } while (!acertado && intentos > 0);
        
        do {
          mostrarMenu();
          opcion = Integer.parseInt(System.console().readLine());
          if (opcion!=1 || opcion!=2) {
            System.out.println("ERROR: Elige las opciones 1 o 2");
          }else if (opcion == 2) {
            System.out.println("Gracias por jugar a -D-I-V-I-N-A-R-E-M-");
          } else if (opcion == 1) {
            System.out.println("Cargando . . .");
          }
        } while (opcion!=1 || opcion!=2);
       
    } while (opcion == 1);
    

    

   
    

  }
}
