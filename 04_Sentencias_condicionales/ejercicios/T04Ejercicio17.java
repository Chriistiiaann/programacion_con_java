import java.util.Scanner;
public class T04Ejercicio17 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numIntroducido;
    int numRestante;

    System.out.print("Introduzca un número: ");
    numIntroducido = sc.nextInt();
    sc.close();

    numRestante = numIntroducido % 10;
    System.out.println("El último número de tu número es: " + numRestante);
 
   } 
}
