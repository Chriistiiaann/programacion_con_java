import java.util.Scanner;

public class T03Ejercicio06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;

        System.out.println("Área del triángulo");
        System.out.println("------------------");

        System.out.print("Introduce la base del triángulo: ");
        base = sc.nextDouble();
        System.out.print("Introduzca la altura del tríangulo: ");
        altura = sc.nextDouble();

        sc.close();

        System.out.println("El área del triángulo es " + (base * altura)/2 + " cm^2" );
    }
}
