 /**
  * Explica tu código aquí
  * 
  * @author Christian Rodríguez Lara
  */
import java.util.Scanner;

public class Ejemplo01{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int nota;

        System.out.print("¿Qué nota has sacado en el último examen?: ");
        nota = sc.nextInt();

        //Sentencia if-else
        if (nota >=5) {
            System.out.println("¡Enhorabuena! ¡has aprobado!");
        } else {
            System.out.println("Lo siento :( Has suspendido. ");
        }

        sc.close();
    }
 }