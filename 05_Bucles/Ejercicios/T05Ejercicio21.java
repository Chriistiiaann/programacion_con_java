/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class T05Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int impar =0 ;
    int maxPar = 0;
    int numIntroducido = 0;
    int sumaImpar = 0;
    int i = 0;
    int j = 0;

    System.out.println("Por favor, vaya introduciendo números enteros.");
    System.out.println("Puede terminar mediante la introducción de un número negativo.");

    do {
      numIntroducido =sc.nextInt();

      if (numIntroducido > 0) {
        i++;
        if (numIntroducido %2 == 1) {
          j++;
          sumaImpar += numIntroducido;
        }else if (numIntroducido > maxPar) {
          maxPar = numIntroducido;
        }
        }
    } while (numIntroducido >=0);
    sc.close();
    System.out.println("Se han introducido " + i + " números");
    System.out.println("La media de los números impares es " + sumaImpar/j);
    System.out.println("El número par con mayor valor introducido es: " + maxPar);
  }
}
