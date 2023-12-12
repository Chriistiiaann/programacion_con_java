/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 *por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 *la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 *máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 *esta manera, la única limitación en el número de dígitos la establece el tipo de
 *dato que se utilice (int o long).

 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long numeroIntroducido;
    int numeroCifras = 1; 

    System.out.print("Introduzca un número y te diré cuantos dígitos tiene: ");
    numeroIntroducido = sc.nextLong();
    long n = numeroIntroducido;
    sc.close();

    while (n > 10) {
      n /= 10;
      numeroCifras ++;
    }

    if (numeroIntroducido == 1) {
      System.out.println("Tiene una única cifra");
    } else if (numeroIntroducido != 1) {
      System.out.println("El número introducido tiene " + numeroCifras + " cifras");
    }
  }
}
