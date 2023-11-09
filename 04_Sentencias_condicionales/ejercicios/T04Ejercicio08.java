import java.util.Scanner;
public class T04Ejercicio08 {
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
    
    if (ecuacion < 0)  {
      System.out.println("Introduzca datos correctos");
    } else {
       if ((ecuacion >=0) && (ecuacion <=4)) {
      System.out.println("Insuficiente");
     } else {
      if ((ecuacion>=5) && (ecuacion <=6)){
        System.out.println("Bien");
      } else {
        if ((ecuacion >=7) && (ecuacion <=8)) {
          System.out.println("Notable");
        } else {
          System.out.println("Sobresaliente");
        }
      }
     }
    }
  }
}