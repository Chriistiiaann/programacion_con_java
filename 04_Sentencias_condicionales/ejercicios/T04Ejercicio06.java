import java.util.Scanner;
public class T04Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double altura;
    final double gravedad;
    double ecuacion;

    System.out.print("Introduzca la altura desde la cual va a dejar caer el objeto (m): ");
    altura = sc.nextDouble();

    gravedad = 9.81;
    ecuacion = Math.sqrt((2*altura)/gravedad);
    sc.close();

    if (altura <=0) {
      System.out.println("¿Me explicas como va a caer el objeto?");
    } else {
      System.out.printf("Tu objeto va a tardar en caer %.2f s", ecuacion );
    }

  }
}
