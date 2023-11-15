import java.util.Scanner;
/**
 * Ejemplo Bucle While - Contador de números positivos introducidos por teclado
 * 
 * @author Christian Rodríguez Lara
 */
public class EjemploWhile02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int  numeroIntroducido = 0; //Variable que controla la salida del bucle
    int numerosPositivos = 0;   //Variable acumuladora de números positivos introducidos
   int suma = 0;                //Variable acumuladora de los números positibos introducidos

    System.out.println("Por favor introduzca números enteros positivos");
    System.out.println("El programa finalizará cuando sea introducido un número negativo");

    while (numeroIntroducido >= 0) {
      System.out.print("Número: ");
      numeroIntroducido = sc.nextInt();
      if (numeroIntroducido > 0) {
        numerosPositivos++;
        suma += numeroIntroducido; // suma = suma + numeroIntroducido
      }
    }
    sc.close();
    System.out.println("La cantidad de números positivos es " + numerosPositivos);
    System.out.println("La suma total de ellos es " + (suma));
  }
}
