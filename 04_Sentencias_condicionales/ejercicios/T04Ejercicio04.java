import java.util.Scanner;
public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horasTrabajadas;
    
    System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
    horasTrabajadas = sc.nextInt();
    sc.close();
    
    if ((horasTrabajadas >=0) && (horasTrabajadas <=40)) {
      System.out.println("El sueldo semanal que le corresponde es de " + (horasTrabajadas*12) + " €");
    } else {
      System.out.println("El sueldo semanal que le corresponde es de " + ((40*12)+((horasTrabajadas-40))*16) + " €");
    }
  }
}
