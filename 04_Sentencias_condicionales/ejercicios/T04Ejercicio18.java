import java.util.Scanner;
public class T04Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIntroducido;

        System.out.print("Introduce un número: ");
        numIntroducido = sc.nextInt();
        sc.close();
        
        if (numIntroducido <10) {
            System.out.println("El primer número del número introducido es: " +numIntroducido);

        }else if ((numIntroducido >=10) && (numIntroducido <100)) {
            numIntroducido = numIntroducido/10;
            System.out.printf("El primer número del número introducido es: " +numIntroducido);

        }else if ((numIntroducido >=100) && (numIntroducido <1000)) {
            numIntroducido = numIntroducido/100;
            System.out.printf("El primer número del número introducido es: " +numIntroducido);
            
        } else if ((numIntroducido >=1000) && (numIntroducido <10000)) {
            numIntroducido = numIntroducido/1000;
            System.out.printf("El primer número del número introducido es: " +numIntroducido);

        } else if ((numIntroducido >=1000) && (numIntroducido <10000)) {
            numIntroducido = numIntroducido/10000;
            System.out.printf("El primer número del número introducido es: " +numIntroducido);

        } else if ((numIntroducido >=10000) && (numIntroducido <99999)) {
            numIntroducido = numIntroducido/10000;
            System.out.printf("El primer número del número introducido es: " +numIntroducido);

        } else if (numIntroducido > 99999) {
            System.out.println("Introduzca un número de 5 cifras");
        }
    }
}
