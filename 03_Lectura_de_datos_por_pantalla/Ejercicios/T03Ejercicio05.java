import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        double base;
        double altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Área del rectángulo");
        System.out.println("-------------------");

        System.out.print("Introduzca la base del rectángulo en centímetros: ");
        base = sc.nextDouble();
        System.out.print("Introduzca la altura del rectángulo en centímetros: ");
        altura = sc.nextDouble();

        sc.close();

        System.out.println("El área del rectángulo es " + (base * altura) + " cm^2");

    }
}
