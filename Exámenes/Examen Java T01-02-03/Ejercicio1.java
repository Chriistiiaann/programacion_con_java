import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String articulo;
   double precio;
   int cantidad;

   System.out.println ("Terminal");
   System.out.println("==========================");

   System.out.print("Introduzca el artículo: ");
   articulo = sc.nextLine();
   System.out.print("Introduzca el precio del artículo sin IVA: ");
   precio = sc.nextDouble();
   System.out.print("Introduzca la cantidad de artículos: ");
   cantidad = sc.nextInt();

   System.out.println(" ");
   sc.close();

   double subtotal = (precio * cantidad);
   double descuento = ((subtotal * 0.15)*-1);
   double subtotal_desc = (subtotal + descuento);
   double iva = (subtotal_desc * 0.21);
   double total = subtotal_desc + iva;
   
   System.out.println("Factura");
   System.out.println("==========================");
   System.out.printf("Artículo"+ " %15s€ \n", articulo);
   System.out.printf("Precio "+ " %15s €/unidad \n",precio);
   System.out.printf("Cantidad %15s €\n",cantidad);
   System.out.printf("Subtotal %15s €\n",subtotal);
   System.out.printf("Descuento (15%%) %15s €\n", descuento);
   System.out.printf("Subtotal con descuento %15s €\n", subtotal_desc);
   System.out.printf("IVA (21%%) %15s €\n",iva );
   System.out.println("==========================");
   System.out.printf("\033[1;30m \033[48;5;8mTOTAL %15s € \033[0m", total);

  }
}
