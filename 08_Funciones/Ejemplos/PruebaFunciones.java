/**
 * Utilización de funciones
 * 
 * @author Christian Rodríguez Lara
 */
import matematicas.*; //Importa la funcion en la cual hay varias funciones

public class PruebaFunciones {
  public static void main(String[] args) {
    int n;
    //Probamos la función esPrimo, alojada en la clase Varias dentro del paquete matematicas

    System.out.print("Introduzca un número entero positivo: ");
    n = Integer.parseInt(System.console().readLine());

    if (Varias.esPrimo(n)) {
      System.out.println("El número introducido " + n + " es primo");
    } else{
      System.out.println("El número introducido " + n + " no es primo");
    }

    //Prueba digitos(), alojada en la clase Varias dentro del paquete matemáticas

    System.out.print("Introduzca un número entero positivo: ");
    n = Integer.parseInt(System.console().readLine());

    int numDigitos = Varias.digitos(n);
    System.out.println(n + " tiene " + numDigitos );

    //Prueba volumenCilindro(), alojada en la clase Volumen dentro del paquete matemáticas

    double r;
    double h;
    System.out.print("Introduzca la altura del cilindro: ");
    h = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el radio del cilindro: ");
    r = Double.parseDouble(System.console().readLine());

    System.out.println("El volumen del cilindro es " + Volumen.volumenCilindro(r, h) + " u^3");

    //Prueba areaCuadrado(), alojada en la clase Area dentro del paquete matemáticas

    double l;
    System.out.print("Introduzca el lado del cuadrado: ");
    l = Double.parseDouble(System.console().readLine());

    System.out.print("El área del cuadrado es: " + Area.areaCuadrado(l));
    
    //Prueba voltear(), alojada en la calse Varias dentro del paquete matemáticas

    System.out.print("Introduzca un número para voltear: ");
    long x = Long.parseLong(System.console().readLine());
    System.out.println("El número introducido "+ x + " volteado es: " + Varias.voltear(x));

    //Prueba int voltear(), alojada en la calse Varias dentro del paquete matemáticas

    System.out.print("Introduzca un número para voltear: ");
    x = Integer.parseInt(System.console().readLine());
    System.out.println("El número introducido "+ x + " volteado es: " + Varias.voltear(x));

    //Prueba long esCapicua(), alojada en la calse Varias dentro del paquete matemáticas

    System.out.println("Introduzca un número para saber si es capicuo o no: ");
    x = Long.parseLong(System.console().readLine());

    if (Varias.esCapicua(x)) {
      System.out.println("El número introducido " + x + " es capicuo");
    } else {
      System.out.println("El número introducido " + x + " no es capicuo");
    }

    //Prueba int esCapicua(), alojada en la calse Varias dentro del paquete matemáticas

    System.out.println("Introduzca un número para saber si es capicuo o no: ");
    x = Integer.parseInt(System.console().readLine());

    if (Varias.esCapicua(x)) {
      System.out.println("El número introducido " + x + " es capicuo");
    } else {
      System.out.println("El número introducido " + x + " no es capicuo");
    }

    //Prueba siguientePrimo(), alojada en la calse Varias dentro del paquete matemáticas

    System.out.print("Introduzca un número para conocer el siguiente primo: ");
    x = Integer.parseInt(System.console().readLine());
    System.out.println("El siguiente primo a " + x + " es "+ Varias.siguientePrimo((int)x));
  } 
}
