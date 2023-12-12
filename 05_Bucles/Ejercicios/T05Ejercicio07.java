/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contraseña = 6666;
    int contraseñaIntroducida;
    int intentos = 1;
    int i = 4;
    
    System.out.println("¡Bienvenid@ a la caja fuerte de Houdini!");
    System.out.println("Para poder abrirla necesitarás introducir la contraseña de cuatro dígitos correcta");
    System.out.println("Recuerda, ¡solo tienes 4 intentos! Sino desaparecerá la caja fuerte");
    System.out.println("¡Suerte!");

    do {
      System.out.print("Introduzca la contraseña de la caja fuerte: ");
      contraseñaIntroducida = sc.nextInt();

      if (contraseña != contraseñaIntroducida) {
        intentos ++;
        if (intentos <= 4) {
          i --;
          System.out.println("¡Sigue Intentándolo! Te quedan " + i + " intentos");
        } else if (intentos >= 4) {
          System.out.println("¡Te has quedado sin intentos!");
        }
      } 
      
      if (contraseña == contraseñaIntroducida) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        break;
      }
    } while (intentos <= 4);
    sc.close();
  }
}
