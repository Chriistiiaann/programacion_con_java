import java.util.Scanner;

public class LeerDatosScanner03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce tres númers (Con o sin decimales) separados por espacios: ");

    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    double num3 = sc.nextDouble();

    sc.close(); //Cerramos el buffer

    double media = (num1 + num2 + num3) / 3;

    System.out.println("Los números son: " + num1 + num2 + num3 + " y la media es: " +media);
    

  }
}
