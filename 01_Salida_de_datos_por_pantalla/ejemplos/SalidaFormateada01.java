/**
 * Salida formateada utilizando enteros,decimales y decimales con precisión
 * 
 * @author Christian Rodríguez
 */

public class SalidaFormateada01 {

public static void main (String [] args){
  System.out.printf ("El número %d no tiene decimales. \n", 21);
  System.out.printf ("El número %f sale con decimales. \n", 21.0);
  System.out.printf ("El %.3f sale exactamente con %d decimales. \n", 50.0, 3);
  System.out.printf("Letra: %c. \n", 83);

  //Para ver el ORDEN
  System.out.printf("Mostramos el segundo argumento: %2$d \nY después el primero %1$.2f", 23.0, 56);
}
}