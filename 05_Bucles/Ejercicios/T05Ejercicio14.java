import java.util.Scanner;
public class T05Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base;
    int exponente;
    double potencia;

    System.out.print("Introduzca el exponente de un número entero (positivo): ");
    base = sc.nextInt();
    System.out.print("Introduzca la base de un número entero: ");
    exponente = sc.nextInt();

    potencia = Math.pow(exponente, base);
  
    System.out.println ("El resultado de la potencia solicitada es: "+ potencia);

  }
}
