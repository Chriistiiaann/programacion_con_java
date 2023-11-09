import java.util.Scanner;
public class T04Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dia;
    int mes;

    System.out.print("Introduce el día en el que nacistes: ");
    dia = sc.nextInt();
    System.out.print("Introduce el mes en el que nacistes: ");
    mes = sc.nextInt();

    sc.close();
    switch (mes) {
      case 1:
      if ((dia >=1) && (dia<=20)) {
        System.out.println("Su signo del zodiaco es Capricornio");
      }
       else if ((dia>=21) && (dia<=31)) {
        System.out.println("Su signo del zodiaco es Acuario");
      }
        break;
      case 2:
      if ((dia >=1) && (dia<=19)) {
        System.out.println("Su signo del zodiaco es Acuario");
      }
       else if ((dia>=20) && (dia<=28)) {
        System.out.println("Su signo del zodiaco es Piscis");
      }
        break;
      case 3:
      if ((dia >=1) && (dia<=20)) {
        System.out.println("Su signo del zodiaco es Piscis");
      }
       else if ((dia>=21) && (dia<=31)) {
        System.out.println("Su signo del zodiaco es Aries");
      }
        break;
      case 4:
      if ((dia >=1) && (dia<=20)) {
        System.out.println("Su signo del zodiaco es Aries");
      }
       else if ((dia>=21) && (dia<=30)) {
        System.out.println("Su signo del zodiaco es Tauro");
      }
        break;
      case 5:
      if ((dia >=1) && (dia<=21)) {
        System.out.println("Su signo del zodiaco es Tauro");
      }
       else if ((dia>=22) && (dia<=31)) {
        System.out.println("Su signo del zodiaco es Géminis");
      }
        break;
      case 6:
      if ((dia >=1) && (dia<=21)) {
        System.out.println("Su signo del zodiaco es Capricornio");
      }
       else if ((dia>=22) && (dia<=30)) {
        System.out.println("Su signo del zodiaco es Cáncer");
      }
        break;
      case 7:
      if ((dia >=1) && (dia<=22)) {
        System.out.println("Su signo del zodiaco es Cáncer");
      }
       else if ((dia>=23) && (dia<=31)) {
        System.out.println("Su signo del zodiaco es Leo");
      }
        break;
      case 8:
      if ((dia >=1) && (dia<=23)) {
        System.out.println("Su signo del zodiaco es Leo");
      }
       else if ((dia>=24) && (dia<=30)) {
        System.out.println("Su signo del zodiaco es Libra");
      }
        break;
      case 9:
      if ((dia >=1) && (dia<=23)) {
        System.out.println("Su signo del zodiaco es Leo");
      }
       else if ((dia>=24) && (dia<=30)) {
        System.out.println("Su signo del zodiaco es Libra");
      }
        break;
      case 10:
      if ((dia >=1) && (dia<=23)) {
        System.out.println("Su signo del zodiaco es Libra");
      }
       else if ((dia>=24) && (dia<=31)) {
        System.out.println("Su signo del zodiaco es Escorpio");
      }
        break;
      case 11:
      if ((dia >=1) && (dia<=22)) {
        System.out.println("Su signo del zodiaco es Capricornio");
      }
       else if ((dia>=23) && (dia<=30)) {
        System.out.println("Su signo del zodiaco es Sagitario");
      }
        break;
      case 12:
      if ((dia >=1) && (dia<=21)) {
        System.out.println("Su signo del zodiaco es Sagitario");
      }
       else if ((dia>=22) && (dia<=31)) {
        System.out.println("Su signo del zodiaco es Capricornio");
      }
        break;
      default:
        System.out.println("Introduzca un valor válido :(");
        break;
    }
  }
}
