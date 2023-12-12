/**
 * Segundo ejemplo del tema 14
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class Ejemplo2 {
  public static void main(String[] args) {
    int lineas;
    int asteriscos;
    int longitud;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Estre programa pinta varias lineas de asteriscos");

    try {
      System.out.print("Introduce el número total de asteriscos: ");
      asteriscos = sc.nextInt();
      System.out.print("Introduce el número total de asteriscos: ");
      lineas = sc.nextInt();
      sc.close();

      if ((asteriscos % lineas) == 0) {
        longitud = asteriscos / lineas;
      } else {
        longitud = (int) Math.ceil((double)asteriscos / (double) lineas);
      }

    } catch (NumberFormatException nfe) {
      System.out.println("Se deben introducit valores de tipo entero");

    } catch (ArithmeticException ae){
      System.out.println("El número no puede ser cero");
    }
  }
}
