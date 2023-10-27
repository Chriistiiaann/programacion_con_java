/**
 * Leer y escribir números introducidos por teclado
 * 
 * @author Christian Rodríguez Lara
 */
public class LeeNumeros {
  public static void main(String[] args) {
   String linea; // variable que almacena cada línea que introduzcamos por teclado

   System.out.println("Introduce un número entero: "); // primer número
   linea = System.console().readLine();

   int num1;
   num1 = Integer.parseInt(linea); //convertimos de String a int

   System.out.println("Introduce otro número entero: "); // segundo número
   linea = System.console().readLine();

   int num2;
   num2 = Integer.parseInt(linea); // convertimos de String a int

   System.out.printf("El primer número es: %d\n", num1);
   System.out.printf("El segundo número es: %d\n", num2);

   System.out.println("El doble del número " + num1 + " es " + (num1*2));
   System.out.println(num1 + num2);


   //Parafraseamos Float
   System.out.print("Introduce un número real: ");
   linea = System.console().readLine();
   float numReal = Float.parseFloat(linea);
   System.out.printf("El número real introducido es: %.2f", numReal);
  }
}
