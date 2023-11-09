import java.util.Scanner;
public class T04Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horas;
    int minutos;
    int segundosTranscurridos;
    int segundosMedianoche;


    System.out.print("Introduzca la hora en la que se encuentra (Formato 24 horas): ");
    horas = sc.nextInt();
    System.out.print("Introduzca los minutos en los que se encuentra: ");
    minutos = sc.nextInt();

    segundosTranscurridos = (horas*3600)+(minutos*60);
    segundosMedianoche = (86400-segundosTranscurridos);
    sc.close();

    if (segundosMedianoche <0) {
      System.out.println("Introduzca una hora correcta");
    } 
    else if (segundosMedianoche == 0) {
      System.out.println("Ya se encuentra en la medianoche");
    }
    else if (segundosMedianoche >0) {
      System.out.println("Le quedan " + segundosMedianoche + " hasta llegar a la medianoche");
    }
  }
}
