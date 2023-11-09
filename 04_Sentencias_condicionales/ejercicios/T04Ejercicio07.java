import java.util.Scanner;
public class T04Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double primeraNota;
    double segundaNota;
    double terceraNota;
    double ecuacion;

    System.out.print("Introduzca la primera nota: ");
    primeraNota = sc.nextDouble();
    System.out.print("Introduzca la segunda nota: ");
    segundaNota = sc.nextDouble();
    System.out.print("Introduzca la tercera nota: ");
    terceraNota = sc.nextDouble();

    sc.close();
    ecuacion = ((primeraNota+segundaNota+terceraNota)/3);
    
    System.out.printf("La nota media entre los tres exámenes es de: %.2f", ecuacion);
  }
}
