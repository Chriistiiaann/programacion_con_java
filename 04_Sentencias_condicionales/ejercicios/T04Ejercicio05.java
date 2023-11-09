import java.util.Scanner;
public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    double ecuacion;

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    a = sc.nextDouble();
    System.out.print("Por favor, introduzca el valor de b: ");
    b = sc.nextDouble();
    sc.close();

    ecuacion = (-b/a);

    if (a==0) {
      System.out.println("Introduzca un número real");
    } else {
      if (ecuacion==0) {
        System.out.println("x = 0");
      } else {
        System.out.printf("x = %.2f",ecuacion);
      }

    }
  }
}
