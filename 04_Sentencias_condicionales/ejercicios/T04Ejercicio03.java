import java.util.Scanner;
public class T04Ejercicio03 {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dia;

    System.out.print("Introduzca un día de la semana: ");
    dia = sc.nextInt();
    sc.close();

    if (dia == 1) {
      System.out.println("El día de la semana solicitado es el ¡Lunes!");
    } else {
      if (dia == 2 ) {
        System.out.println("El día de la semana solicitado es el ¡Martes!");
      } else {
        if (dia == 3 ) {
          System.out.println("El día de la semana solicitado es el ¡Mieércoles!");
        } else {
          if (dia == 4) {
            System.out.println("El día de la semana solicitado es el ¡Jueves!");
          } else {
            if (dia == 5) {
              System.out.println("El día de la semana solicitado es el ¡Viernes!");
            } else {
              if (dia == 6) {
                System.out.println("El día de la semana solicitado es el ¡Sábado!");
              } else {
                if (dia == 7) {
                  System.out.println("El día de la semana solicitado es el ¡Domingo!");
                } else {
                  System.out.println("¡No existe ese día de la semana!");
                }
              }
            }
          }
        }
      }
    }
  }
}
