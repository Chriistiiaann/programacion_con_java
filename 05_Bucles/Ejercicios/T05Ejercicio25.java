/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class T05Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numIntroducido = 0;
    int numReves = 0;
    int copiaNumero;
    System.out.print("Introduzca un número: ");
    numIntroducido = sc.nextInt();
    copiaNumero = Math.abs(numIntroducido);

    while (copiaNumero > 0) {
      numReves = (copiaNumero % 10) + (numReves * 10);
      copiaNumero /= 10;
    }
      if (numIntroducido > 0) {
        System.out.println("El numero " + numIntroducido + " dado la vuleta es " + numReves );
      } else {
        System.out.println("El numero " + numIntroducido + " dado la vuleta es " + numReves );
      }
      
    }
}
 