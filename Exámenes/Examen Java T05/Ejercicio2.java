import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String primerNombre;
    String segundoNombre;

    System.out.print("Introduce el primer nombre: ");
    primerNombre = sc.next();
    System.out.print("Introduce el segundo nombre: ");
    segundoNombre = sc.next();

    int numeroLetrasPrimerNombre = primerNombre.length();
    int numeroLetrasSegundoNombre = segundoNombre.length();

    String jugada;

    int piedra = 0;
    int papel = 0;
    int tijera = 0;

    int piedra2 = 0;
    int papel2 = 0;
    int tijera2 = 0;
    int i = 0;
    int j = 0;
    
    do {
    System.out.print("Introduce tu jugada "+primerNombre+" : ");
    jugada = sc.next();

    switch (jugada) {
      case "tijera":
        tijera = 1;
        break;
      case "piedra":
        piedra = 1;
        break;
      case "papel":
        papel = 1;
        break;
      default:
       System.out.print("Introduce un dato correcto!");
       break;
    }

    System.out.print("\033[H\033[2J"); 

    System.out.flush();

    System.out.print("Introduce tu jugada "+segundoNombre+" : ");
    jugada = sc.next();

    switch (jugada) {
      case "tijera":
        tijera = 2;
        break;
      case "piedra":
        piedra2 = 2;
        break;
      case "papel":
        papel2 = 2;
        break;
      default:
        System.out.print("Introduce un dato correcto: ");
        break;
    }
    
    


    if ((piedra < piedra2) || (tijera < tijera2) || (papel < papel2)){
      System.out.print("Gana el jugador 2");
      i++;
    } else {
      System.out.print("Gana el jugador 1");
      j++;
    }

    System.out.println();

    System.out.print(" ");
    for (int k = 0; k <= numeroLetrasPrimerNombre; k++) { //Pintamos base superior
      System.out.print("-");
    }

    System.out.print(" ");
    for (int k = 0; k < 3; k++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int k = 0; k < 3; k++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int k = 0; k < 3; k++) {
      
      System.out.print("-");
    }

    System.out.println();

    for (int k = 0; k < 1; k++) { //pintamos el medio
      System.out.print("|");
      System.out.print(" "+ primerNombre + " ");
      System.out.print("|");

        System.out.print(" "+ i + " ");
        System.out.print("|");
      
        System.out.print(" "+ j + " ");
        System.out.print("|");
        
        System.out.print(" ");
        System.out.print(" "+ segundoNombre + " ");
        System.out.print("|");
    }
    System.out.println();

    System.out.print(" ");
    for (int k = 0; k <= numeroLetrasSegundoNombre; k++) { //Pintamos base inferior
      System.out.print("-");
    }

    System.out.print(" ");
    for (int k = 0; k < 3; k++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int k = 0; k < 3; k++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int k = 0; k < 3; k++) {
      
      System.out.print("-");
    }

    System.out.println();

    } while ((i >=3) || (j>=3));
    
  }
}
