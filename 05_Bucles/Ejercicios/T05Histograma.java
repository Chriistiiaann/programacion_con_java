/**
 * Explica tu código aquí
 * 
 * @author Christian Rodríguez Lara
 */   
public class T05Histograma {

public static void main(String[] args) {

  int cifraIntroducida = 0;       // Almacena la cifra introducida
  long numCompleto = 0;           // Número formado al finalizar la inclusión de todas las cifras
  long numVolteado = 0; 
  int digito = 0;                 // Lee el dígito
  int digitoMayor = 0;            // Almacena el dígito mayor al ser introducido
  int numeroDigitos = 0;          // Almacena los dígitos introducidos

  System.out.println("Introduzca números entre 0 y 9 pulsa INTRO. Introduce un número negativo para parar.");



  do {
    cifraIntroducida = Integer.parseInt(System.console().readLine());   // Lee números
    if (cifraIntroducida >=0 && (cifraIntroducida <=9)) {               // Nos quitamos el número negativo a la hora de ser introducido
     numCompleto = (numCompleto * 10) + cifraIntroducida;               // Montamos el número
    }
  } while (cifraIntroducida>=0);

  //vuelta al número para saber qué número es el mayor 

  while (numCompleto >0) {
    digito = (int) (numCompleto % 10);
    if (digito > digitoMayor ) {
      digitoMayor = digito;
    }
    numVolteado = numVolteado * 10 + digito;
    numCompleto /= 10;
    numeroDigitos ++;
  }

  //Mostramos en forma de tabla , teniendo en cuenta que hay que pintar el digitoMayor + 1 columna y numDigitos filas

  int numColumnas = digitoMayor +1;
  int numFilas = numeroDigitos;

  //Pintamos la primera hilera de guiones

  for (int i = 1; i <= numColumnas; i++) {
    System.out.print(" ---");
  }

  // Empezamos a pintar las filas
  for (int i = 1; i <= numFilas; i++) {
    System.out.println();                     // Salto de línea
    digito = (int) numVolteado % 10;          // Cogo el dígito menos significativo del numeroVolteado
    numVolteado  /= 10;
    System.out.print("| " + digito + " |");   // Pintamos la 1º Columna, de los digitos introducidos

    // Pintamos tantas columnas con astericos como infique el digito
    for (int j = 1; j <= digito; j++) {
      System.out.print(" * |");
    }

    // Pintamos el resto de columnas sin asterisco
    for (int j = 1; j <= numColumnas - digito - 1; j++) {
      System.out.print("   |");
    }

    System.out.println(); // Salto de línea

    for (int j = 1; j <= numColumnas; j++) {
      System.out.print(" ---");
    }

  }


  

   
  }  
}







 

