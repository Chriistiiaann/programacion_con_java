import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double twb;
    double año;
    double total;
    double conversion;

    System.out.println("VIDA ÚTIL SSD");
    System.out.println("===============================================");

    System.out.print("Introduzca el factor TBW de tu disco duro SSD: ");
    twb = sc.nextDouble();

    año = twb * 6;
    total = año/365;
    conversion = total * 1000;
    sc.close();
    
    System.out.printf("La cantidad máxima de terabytes que puedes escribir por día es: %1$.4f TB (%2$.1f GB)", total, conversion);
  }
}
