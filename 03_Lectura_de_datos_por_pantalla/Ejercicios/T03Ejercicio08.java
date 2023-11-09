import java.util.Scanner;

public class T03Ejercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horas;

        System.out.println("Salario semanal");
        System.out.println("---------------");

        System.out.print("Introduzca las horas trabajadas esta semana: ");
        horas = sc.nextInt();

        sc.close();

        System.out.println("El salario semanal en base a 12 euros por hora es de: " + horas * 12 + " €" );
    }
}
