/**
 * Ejemplo do-while - Programa que lee números de teclado mientras el número introducido sea par
 * 
 * @author Christian Rodríguez Lara
 */
public class EjemploDoWhile02 {
  public static void main(String[] args) {
    int numero = 0; 
    do {
      System.out.print("Introduzca un número par: ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero % 2 == 0) {
        System.out.println("Ay que bonito es el número par " + numero);
      } else{
        System.out.println("No me gustan los números impares, Adiós");
      }
    } while (numero % 2 == 0);
  }
}
