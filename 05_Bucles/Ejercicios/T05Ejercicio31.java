/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class T05Ejercicio31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int alturaIntroducida;

    System.out.print("Introduzca la altura de su L: ");
    alturaIntroducida = sc.nextInt();
    
    for (int i = 1; i < alturaIntroducida; i++) {
      System.out.println("*");
    }
    for (int i = 1; i <= (alturaIntroducida/2)+1; i++) {
      System.out.println("*");
    }
  }
}
