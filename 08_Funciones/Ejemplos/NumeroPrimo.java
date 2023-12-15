/**
 * Números Primos
 * 
 * @author Christian Rodríguez Lara
 */
public class NumeroPrimo{
  public static void main(String[] args) {
    System.out.println("Introduce un número entero postivo: ");
    int n = Integer.parseInt(System.console().readLine());
    boolean esPrimo = true;

    for (int i = 2; i < n; i++) {
      if ((n % i == 0)) {
        esPrimo = false;
      }
    }

    if (esPrimo) {
      System.out.println("El número introducido " + n + " es primo.");
    }else{
      System.out.println("El número introducido " + n + " no es primo.");
    }
  }
}