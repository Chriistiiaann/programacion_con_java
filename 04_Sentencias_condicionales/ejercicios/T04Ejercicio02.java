import java.util.Scanner;

public class T04Ejercicio02 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hora;

    System.out.print("Introduzca una hora del día: ");
    hora = sc.nextInt();
    sc.close();

    if ((hora >= 6 ) && (hora <= 12 )) {
      System.out.println("¡Buenos días!");
    }
    else {
      if ((hora >=13) && (hora <= 20)) {
        System.out.println("¡Buenas Tardes!");
      } else {
        if ((hora >=21) && (hora <=24)) {
          System.out.println("¡Buenas Noches!");
        } else {
          if ((hora >=0) && (hora <=5)) {
            System.out.println("¡Buenas Noches!");
          } else {
            System.out.println("¡El día solo tiene 24 horas!");
          }
        }
      } 
    }
  } 
}

