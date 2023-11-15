/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class T05Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numIntroducido;
    int multiplicacion;

    System.out.print("Introduce la tabla de multiplicar que desea visualizar: ");
    numIntroducido = sc.nextInt();
    sc.close();

    for (int i = 0; i <=10; i++) {
       multiplicacion = numIntroducido * i;
       System.out.println( numIntroducido + " x "+ i + " = " + multiplicacion);
    }

  }
}
