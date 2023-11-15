import java.util.Scanner;

public class T04Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double baseImponible;
    String iva;
    int porcetajeIva = 0;
    String codPromocional;
    double descuento = 0;

    System.out.print("Introduzca la base imponible: ");
    baseImponible = sc.nextInt();

    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido):");
    iva = sc.nextLine().toLowerCase();

    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
    codPromocional = sc.nextLine().toLowerCase();

    switch (iva) {
      case "general":
        porcetajeIva = 21;
        baseImponible = baseImponible *0.21;
        break;
      case "reducido":
        porcetajeIva = 10;
        baseImponible = baseImponible *0.10;
        break;
      case "superreducido":
        porcetajeIva = 4;
        baseImponible = baseImponible *0.4;
        break;
      default:
      System.out.println("Introduzca un tipo de iva correcto.");
        break;
    }

    switch (codPromocional) {
      case "nopro":
        descuento = 0;
        break;
        
      case "mitad":
        descuento = baseImponible/2;
        break;

      case "meno5":
        descuento = 5;
        break;

      case "5porc":
        descuento = baseImponible * (5 / 100);
        break;
      default:
      System.out.println("Introduzca un tipo de iva correcto.");
        break;
    }
  }
}
