/**
 * Explica tu código aquí
 * 
 * @author Christian Rodríguez Lara
 */
public class T02_Ejercicio06 {
  public static void main(String[] args) {
    double precioSinIva = 15;

    System.out.printf("Precio sin iva %8.2f \n", precioSinIva);
    System.out.printf("IVA            %8.2f \n", (precioSinIva * 0.21) );
    System.out.printf("------------------------");
    System.out.printf("Precio con iva  \n" + (precioSinIva * 0.21));
  }
}
