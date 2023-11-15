import java.util.Scanner;

public class T04Ejercicio22BIS {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int MINUTOSTOTALES =(4*24*60) + (15*60);
    int diasTranscurridos = 0;
    int hora;
    int minutos;
    int minutosTranscurridos;

    System.out.print("Introduzca un día de la semana (lunes a viernes): ");
    String dia = sc.nextLine();


    switch (dia) {
      case "lunes":
        diasTranscurridos = 0;
        break;

      case "martes":
        diasTranscurridos = 1;
        break;

      case "miércoles","miercoles":
        diasTranscurridos = 2;
        break;

      case "jueves":
        diasTranscurridos = 3;
        break;

      case "viernes":
        diasTranscurridos = 4;
        break;
      
      default:
      System.out.println("Introduzca un día de la semana correcto.");
        break;
    }
    System.out.print("Por favor introduzca las hora del día introducido: ");
    hora = sc.nextInt();
    System.out.print("Por favor introduzca los minutos del día introducido: ");
    minutos = sc.nextInt();

    minutosTranscurridos = (diasTranscurridos * 24 * 60) + (hora * 60) + minutos;
    System.out.println("¡Faltan " + (MINUTOSTOTALES - minutosTranscurridos) + " para que sea fin de semana!");
  }
}