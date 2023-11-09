import java.util.Scanner;
public class T04Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    double c;
    double ecuacion1;
    double ecuacion2;
    double discriminante;


    System.out.print("Introduzca el valor de a: ");
    a = sc.nextDouble();
    System.out.print("Introduzca el valor de b: ");
    b = sc.nextDouble();
    System.out.print("Introduzca el valor de c: ");
    c = sc.nextDouble();
    sc.close();

    discriminante = (b*b -4*a*c);
    ecuacion1 = (((-b) + Math.sqrt(discriminante))/2*a);
    ecuacion2 = (((-b) - Math.sqrt(discriminante))/2*a);

    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("Introduzca datos correctos");

    } 
    else if (discriminante <=0) {
      System.out.println("Introduzca datos correctos");

    } else {
      System.out.printf("La solucion a la ecuacion es %.2f", ecuacion1);
      System.out.printf("La solucion a la ecuacion es %.2f", ecuacion2);
    }
  }
}
