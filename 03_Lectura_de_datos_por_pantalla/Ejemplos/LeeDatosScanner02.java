import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Christian Rodríguez Lara
 */
public class LeeDatosScanner02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);      // Creamos un objeto de la clase Scanner, llamado sc

    System.out.print("Introduce tu nombre, primer apellido, segundo apellido y edad: ");
    
    String nombre = sc.next();      // No ponemos el nextline, ya que sino saltaría de línea
    String apellido1 = sc.next();
    String apellido2 = sc.next();
    int edad = sc.nextInt();

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
    System.out.println("");
    System.out.println("Tu nombre es: " + nombre);
    System.out.println("Apellido 1: " + apellido1);
    System.out.println("Apellido 2: " + apellido2);
    System.out.println("Edad: " + edad);
    sc.close();       // Cerramos el buffer para evitar el Warning

  }
}
