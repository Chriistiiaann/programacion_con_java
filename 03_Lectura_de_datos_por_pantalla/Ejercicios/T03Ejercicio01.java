import java.util.Scanner;

public class T03Ejercicio01 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca dos números (Con o sin decimales) separados por espacios: ");

     double num1 = sc.nextDouble();
     double num2 = sc.nextDouble();
     
     sc.close();
     double operacion = (num1 * num2);

     System.out.printf("El resultado de la multiplicación del número " + num1 + " y el número " + num2 + " es: " + operacion);
     
    }
}