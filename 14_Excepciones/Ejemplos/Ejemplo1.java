/**
 * Primer ejemplo del tema 14
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class Ejemplo1 {
  public static void main(String[] args) {
    double num1;
    double num2;
    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("Introduce un número: ");
      num1 = sc.nextDouble();
      System.out.print("Introduce el segundo número: ");
      num2 = sc.nextDouble();
      sc.close();
      System.out.println("La media es " + (num1+num2)/2);
    } catch (Exception e) {
      System.out.println("No se puede calcular la media.");
      System.out.println("Los datos introducidos no son correctos.");
    } finally { // Opcional
      System.out.println("¡ Gracias por usar este programa !");
      System.out.println(":)");
    }
  }
  
}

