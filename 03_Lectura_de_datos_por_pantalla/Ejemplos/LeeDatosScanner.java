import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Christian Rodríguez Lara
 */

public class LeeDatosScanner {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252");      //Creamos un objeto de la clase scanner, llamado sc

    System.out.print("Introduce tu nombre: ");
    String nombre = sc.nextLine();       // Guardamos en la variable nombre lo que introducimos por teclado

    System.out.print("Introduce tu edad: ");
    int edad = sc.nextInt();      // Guardamos en la variable eda lo que introducimos por teclado

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");

    sc.close();      //Cerramos Scanner
  }
}
