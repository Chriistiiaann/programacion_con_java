import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double R; // Radio mayor
    double r; // Radio menor
    double h; // Altura

    System.out.printf("\033[1m VOLUMEN DE UN TRONCO DE CONO \033[0m \n");
    System.out.printf("=============================================== \n");

    System.out.print("Introduzca el radio de la base mayor R (cm) : ");
    R = sc.nextDouble();
    System.out.print("Introduzca el radio de la base menor r (cm) : ");
    r = sc.nextDouble();
    System.out.print("Introduzca la altura (cm) : ");
    h = sc.nextDouble();
    
    Double volumen = ((Math.PI*h*(R*R+r*r+R*r))/3);
    sc.close();

    System.out.printf("El volumen del toroide es de\033[38;5;9m %.4f cm\u00B3 \033[0m", volumen);

  }
}
