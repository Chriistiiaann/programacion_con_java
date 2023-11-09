import java.util.Scanner;

public class T03Ejercicio09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double radio;
        double altura;

        System.out.println("Volumen de un cono");
        System.out.println("------------------");

        System.out.print("Introduzca el radio de la base del cono: ");
        radio = sc.nextDouble();
        System.out.print("Introduzca la altura del cono: ");
        altura = sc.nextDouble();

        sc.close();

        System.out.printf("El volumen de el cono es:\033[34m %.3f\033[0m cm^3 " , ((Math.PI * radio * radio * altura)/3));
    }
}

