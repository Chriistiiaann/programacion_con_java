import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        double x;
        double y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        x = sc.nextDouble();
        System.out.print("Introduzca otro número: ");
        y = sc.nextDouble();
        
         sc.close();

        System.out.println("x = " + x );
        System.out.println("y = " + y );
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = "+ (x * y));
        System.out.println("x / y = "+ ( x / y));


    }
}
