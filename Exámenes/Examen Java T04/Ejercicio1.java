/**
 * Ejercicio1
 * 
 * @author Christian Rodríguez Lara
 */
import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String seccionTienda;
    int seccionAlimentos;
    double iva = 0;
    String articulo;
    double precio;
    double cantidad;
    double total;
    double ivaAl;
    double totalConIva;

    System.out.println("Introduzca el tipo de producto ");
    System.out.println("1. Alimentación");
    System.out.println("2. Farmacia");
    System.out.println("3. Electrónica");
    System.out.println("4. Moda");
    System.out.print("Opción: ");
    seccionTienda = sc.next();

    switch (seccionTienda) {
      case "1":
        System.out.println("Introduzca el tipo de alimento ");
        System.out.println("1. Huevos");
        System.out.println("2. Pan");
        System.out.println("3. Leche");
        System.out.println("4. Frura");
        System.out.println("5. Carne");
        System.err.println("6. Agua");
        System.out.println("7. Verdura");
        System.out.println("8. Otros");
        System.out.print("Opción: ");
        seccionAlimentos = sc.nextInt();

        switch (seccionAlimentos) {
          case 1,2,3,4,7:
            iva = 4;
            break;
          case 5,6,8:
            iva = 10;
            break;
          default:
          System.out.println("Introduzca un tipo de alimento correcto");
            break;
        }
        break;

      case "2":
        iva = 4;
        break;
      case "3","4":
        iva = 21;
        break;
      default:
       System.out.println("Introduzca un tipo de producto correcto");
        break;
    }
    String codPromocional;
    
    System.out.print("Introduzca el nombre del producto: ");
    articulo = sc.next();
    System.out.print("Introduzca la cantidad de productos: ");
    cantidad = sc.nextInt();
    System.out.print("Introduzca el precio por unidad del producto: ");
    precio = sc.nextDouble();
    System.out.print("Introduzca un código promocional: ");
    codPromocional = sc.next();

    
    total = cantidad * precio;
    ivaAl = (total * iva)/100;
    totalConIva = total + ivaAl;

    if (codPromocional == "SINIVA") {
      iva = 0;
    System.out.println("Factura");
    System.out.println("-----------------------------------");
    System.out.printf("Articulo  " + articulo + "\n");
    System.out.printf("Precio " + precio + " €/unidad \n");
    System.out.printf("Total " + total + "€\n");
    System.out.print("Descuento "+ codPromocional);
    System.out.printf("IVA al " + iva + " %% " + ivaAl + "€\n");
    System.out.printf("-----------------------------------\n");
    System.out.printf("Total con IVA \n" + totalConIva);

    } else if ((seccionTienda == "3") && (codPromocional == "PROMO50")){
      total = (total * 50)/100 - total;
    System.out.println("Factura");
    System.out.println("-----------------------------------");
    System.out.printf("Articulo  " + articulo + "\n");
    System.out.printf("Precio " + precio + " €/unidad \n");
    System.out.printf("Total " + total + "€\n");
    System.out.print("Descuento "+ codPromocional);
    System.out.printf("IVA al " + iva + " %% " + ivaAl + "€\n");
    System.out.printf("-----------------------------------\n");
    System.out.printf("Total con IVA \n" + totalConIva);

    }else if ((seccionTienda == "4") && (codPromocional == "PROMO3X2")) {
      cantidad = cantidad - (cantidad / 3);
      total = cantidad * precio;
    }else if (codPromocional == "NO") {
    System.out.println("Factura");
    System.out.println("-----------------------------------");
    System.out.printf("Articulo  " + articulo + "\n");
    System.out.printf("Precio " + precio + " €/unidad \n");
    System.out.printf("Total " + total + "€\n");
    System.out.printf("IVA al " + iva + " %% " + ivaAl + "€\n");
    System.out.printf("-----------------------------------\n");
    System.out.printf("Total con IVA \n" + totalConIva);
    }
  }
}
