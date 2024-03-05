/**
 * Explica tu código aquí
 * 
 * @author Christian Rodríguez Lara
 */
public class Ejercicio_1 {
  public static void main(String[] args) {
    int minIntroducido; //Intervalo mínimo
    int maxIntroducido; //Intervalo máximo

    int intervalomin; //Intervalo mín DIVINAREM
    int intervalomax; //Intervalo máx DIVINAREM
    boolean correcto = false;
    int numIntroducido = 0;
    int numGenerado = 0; //Numero aleatorio generado

    System.out.println("-D-I-V-I-N-A-R-E-M-");
    System.out.println("Divinarem pensará un número entre los valores que tu decidas");

    System.out.print("Introduce el valor mínimo del Intervalo: ");
    minIntroducido = Integer.parseInt(System.console().readLine()); //Inetervalo minimo ofrecido

    System.out.print("Introduce el valor máximo del Intervalo: ");
    maxIntroducido = Integer.parseInt(System.console().readLine()); //Intervalo máximo ofrecido 

    
   
    intervalomax = (int)(Math.random()*maxIntroducido);
    intervalomin = (int)(Math.random()*minIntroducido);

    numGenerado = (int)(Math.random()*(maxIntroducido-minIntroducido))+minIntroducido;

    
    System.out.println("Estoy pensando entre " + intervalomin + " y " + intervalomax);


    // Lógica num intentos
    int intentos = (int)(Math.log(intervalomax-intervalomin+1) / Math.log(2));
    System.out.println("Dispones de " + intentos + " para adivinar el número");
    // Lógica adivinar si es mayor o menor
    do {
      int i = 0;
      System.out.print("Escribe el número: ");
      numIntroducido = Integer.parseInt(System.console().readLine());

      if (numIntroducido < numGenerado) {
        System.out.println("Te has quedado corto!");
      } else if (numIntroducido > numGenerado) {
        System.out.println("Te has pasado!");
      } else if (numIntroducido == numGenerado) {
        System.out.println("Enhorabuena!!! Has acertado.");
        System.out.println("Efectivamente, el número era: " + numGenerado);
        correcto = true;
      } 
      i++; // aux para controlar las veces que se introduce un número
      if (i > intentos) {
        System.out.print("Has superado el límite de intentos !!!");
        break;
      }
    } while (!correcto); // - * - = +
    
    


  }
}