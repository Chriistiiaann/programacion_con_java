/**
 * Ejercicio3
 * 
 * @author Christian Rodríguez Lara
 */

import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double primerNumero;
    double segundoNumero;
    String codigOperacion;
    double operacion;

    System.out.print("Escribe el primer operando: ");
    primerNumero = sc.nextDouble();
    System.out.print("Escribe el codigo de la operación (+, -, *, /, ^, %): ");
    codigOperacion = sc.next();
    System.out.print("Escribe el segundo operando: ");
    segundoNumero = sc.nextDouble();
    sc.close();

    switch (codigOperacion) {
      case "+":
        operacion = primerNumero + segundoNumero;
        System.out.println(primerNumero + " + " + segundoNumero + " = " + operacion);
        break;
      case "-":
        operacion = primerNumero - segundoNumero;
        System.out.println(primerNumero + " - " + segundoNumero + " = " + operacion);
        break;
      case "*":
        operacion = primerNumero * segundoNumero;
        System.out.println(primerNumero + " * " + segundoNumero + " = " + operacion);
        break;
      case"/":
        operacion = primerNumero / segundoNumero;
        System.out.println(primerNumero + " / " + segundoNumero + " = " + operacion);
        break;
      case "^":
        operacion = Math.pow(primerNumero, segundoNumero);
        System.out.println(primerNumero + " ^ " + segundoNumero + " = " + operacion);
        break;
      case "%":
        operacion = (primerNumero * segundoNumero)/100;
        System.out.println(primerNumero + " % " + segundoNumero + " = " + operacion);
        break;

      default:
        System.out.println("Introduzca un código de operación correcto");
        break;
    }
    
  }
  
}