import java.util.Scanner;

public class T04Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String diaDeLaSemana;
    int dia;
    System.out.print("Introduzca un día de la semana: ");
    dia = sc.nextInt();

    sc.close();
    
    switch (dia) {
      case 1:
        diaDeLaSemana = "Los lunes a primera tenemos FOL";
        System.out.println(diaDeLaSemana);
        break;
      case 2: 
        diaDeLaSemana = "Los martes a primera tenemos PROGRAMACIÓN";
        System.out.println(diaDeLaSemana);
        break;
      case 3:
        diaDeLaSemana = "Los miercoles a primera tenemos ENTORNOS DE DESARROLLO";
        System.out.println(diaDeLaSemana);
        break;
      case 4:
        diaDeLaSemana = "Los jueves a primera tenemos BASES DE DATOS";
        System.out.println(diaDeLaSemana);
        break;
      case 5:
        diaDeLaSemana = "Los viernes a primera tenemos PROGRAMACIÓN";
        System.out.println(diaDeLaSemana);
        break;
      case 6:
        diaDeLaSemana = "Los sábados ¡No hay clase!";
        System.out.println(diaDeLaSemana);
        break;
      case 7:
        diaDeLaSemana = "Los domingos ¡No hay clase!";
        System.out.println(diaDeLaSemana);
        break;
      default:
        System.out.println("El día solicitado, no existe en la semana :D");
        break;
    }
  }
}
