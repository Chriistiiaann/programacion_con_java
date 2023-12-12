import java.util.Scanner;
public class Ejercicio2 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int pisoDestino = 0;
  int pisoActual = 0;
  int personas;
  int maxPersonas = 4;
  int limitePeso = 300;
  int peso;
  while (pisoDestino != -1) {

  System.out.println("Introduzca a que piso desea viajar: ");
  pisoDestino = sc.nextInt();
  System.out.println("Introduzca cuantas personas hay en el ascensor: ");
  personas = sc.nextInt();
  System.out.println("Introduzca el peso del ascensor: ");
  peso = sc.nextInt();

  if ((pisoDestino > 10) || (pisoDestino<0)) {
    System.out.println("Su solicitud ha sido rechazada");
  }else if (peso > limitePeso) {
    System.out.println("Su solicitud a sido rechazada, sobrepasa el límite de peso");
  }else if (personas > maxPersonas) {
    System.out.println("Hay mas personas de las que puede haber en el ascensor");
  }

  pisoActual = pisoActual + pisoDestino;
  System.out.println(pisoActual);
  if (pisoActual > pisoDestino) {
    System.out.println("Subiendo...");
    System.out.println("Se encuentra en el piso " + pisoActual);
  }else if (pisoDestino < pisoActual) {
    System.out.println("Bajando...");
    System.out.println("Se encuentra en el piso " + pisoActual);
  }
  }

 }
}
