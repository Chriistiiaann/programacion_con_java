package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Christian Rodríguez Lara
 */
public class Varias {

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

  
  /** 
   * Voltea un número introducido por teclado
   * 
   * @param x un número de tipo long
   * @return long el número volteado
   */
  public static long voltear(long x) {
    if (x < 0) {
      return -voltear(-x);
    }
    long numVolteado = 0;

    while (x > 0) {
      numVolteado = (numVolteado * 10) + (x % 10);
      x /= 10;
    }
    return numVolteado;
  }

  /** 
   * Voltea un número introducido por teclado
   * 
   * @param x un número de tipo int
   * @return int el número volteado
   */
  public static int voltear(int x) {
    return (int)voltear((long)x);
  }

  public static boolean esCapicua(long x) {
    boolean resultado = false;
    if (x == voltear(x)) {
      resultado = true;
    } 
    return resultado;

  }

  public static boolean esCapicua(int x){
    return esCapicua((long)x);
  }

  public static int siguientePrimo(int x) {
    do {
      x++;
    } while (esPrimo(x) == false);
    return x;
  }
}