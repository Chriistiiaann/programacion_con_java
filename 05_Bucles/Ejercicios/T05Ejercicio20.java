/**
 * Explica tu código aquí
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class T05Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String caracter;
    int altura;

    System.out.print("Introduzca el caracter con el que desea ver la pirámide pintada: ");
    caracter = sc.nextLine();
    System.out.print("Introduzca la altura de la pirámide que desea: ");
    altura = sc.nextInt();

    int nivel = 1; 
    int espaciosPorDelante = altura - 1;
    int espaciosPorDentro = 0;

    while (nivel < altura) {
      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      System.out.print(caracter);

      for (int i = 1; i < espaciosPorDentro; i++) {
        System.out.print(" ");
      }
      if (nivel > 1) {
        System.out.print(caracter);
      }

      System.out.println(" ");

      espaciosPorDentro += 2;
      espaciosPorDelante --;
      nivel ++;
    }

    for (int i = 1; i < altura * 2; i++) {
      System.out.print(caracter);
    }

  }
}
