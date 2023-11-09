import java.util.Scanner;

public class T03Ejercicio02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca otro número: ");
        int num2 = Integer.parseInt(sc.nextLine());

        int suma = num1 + num2;
        int resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        sc.close();

        System.out.println("La suma de los números " + num1 + " y el número " + num2 + " es = " + suma);
        System.out.println("La resta de los números " + num1 + " y el número " + num2 + " es = " + resta);
        System.out.println("La división de los números " + num1 + " y el número " + num2 + " es = " + division);
       System.out.println("La multiplicación de los números " + num1 + " y el número " + num2 + " es = " + multiplicacion);
        
    }
}
