/**
 * Explica tu código aquí
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class T05Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numIntroducido;
    int positivo = 0;
    int negativo = 0;

    System.out.println ("Introduzca 10 números enteros: ");
    for (int i = 0; i < 10; i++) {
      numIntroducido = sc.nextInt();
      if (numIntroducido >= 0) {
        positivo ++;
      } else if (numIntroducido < 0) {
        negativo--;
      }
    }
    sc.close();
    System.out.println("Han sido introducidos "+ positivo + " números positivos y " + negativo + " negativos");
    
    
  }
}
