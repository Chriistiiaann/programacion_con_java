import java.util.Scanner;
public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numeroIntroducido = 0;
    double i = 0;
    double suma = 0;
    double media;

    do {
      System.out.print("Introduzca una nota: ");
      numeroIntroducido = sc.nextDouble();
      if (numeroIntroducido >= 0) {
        suma += numeroIntroducido;
        i++;
      } 
    } while (numeroIntroducido > 0);

    media = suma / i;
    System.out.print(media);
    sc.close();
  }
}
