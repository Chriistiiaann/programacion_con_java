public class T05Ejercicio33 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca la altura de la letra U: ");
    altura = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < altura; i++) {
      System.out.print("*");
        for (int j = 2; j < altura; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
    }

    System.out.print(" ");
    for (int i = 2; i < altura; i++) {
      System.out.print("*");
    }


  }
}
