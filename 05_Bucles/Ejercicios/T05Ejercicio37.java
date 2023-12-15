public class T05Ejercicio37 {
  public static void main(String[] args) {
    int altura = 0;
    int base = 0;

    System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2):");
    base = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora introduzca la altura (como mínimo 2):");
    altura = Integer.parseInt(System.console().readLine());

    if ((altura < 2) || (base < 2))  {
      System.out.print("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2");
    }

 
    for (int i = 1; i <= base; i++) {
      System.out.print("* ");
    }

    for (int i = 2; i < altura; i++) {
      System.out.printf("\n*");

      for (int j = 0; j < base; j++) {
        System.out.print(" ");
      }
      System.out.print(" *");
      
    }
    System.out.println();

    for (int i = 1; i <= base; i++) {
      System.out.print("* ");
    }

  }
}
