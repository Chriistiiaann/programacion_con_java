/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class T05Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int i = 0;
      int numIntroducido = 0;
      int sumaNumIntroducido = 0;
      int valorMax = 10000;

    
      do {
        System.out.print("Introduzca un número: ");
        numIntroducido= sc.nextInt();
        i++;
        sumaNumIntroducido += numIntroducido;
        
      } while (sumaNumIntroducido <= valorMax);

      System.out.println("La suma de los números introducidos es: " + sumaNumIntroducido);
      System.out.println("La media de los números introducidos es: "+ sumaNumIntroducido/i);
      System.out.println("Usted ha introducido " + i + " números");
  }
}
