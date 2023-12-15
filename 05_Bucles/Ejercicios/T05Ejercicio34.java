public class T05Ejercicio34 {
  public static void main(String[] args) {
    long primerNum;
    long segundoNum;

    System.out.print("Por favor, introduzca un número: ");
    primerNum = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca otro número: ");
    segundoNum = Long.parseLong(System.console().readLine());

    // vuelta primer número
    long numIntroducido = primerNum;
    long volteado1 = 0;
    int longitud = 0;

    if (numIntroducido == 0) {
      longitud = 1;
    }

    while (numIntroducido > 0) {
      volteado1 = (primerNum * 10) + (primerNum % 10);
      volteado1 /= 10;
      longitud ++;
    }

    //vuelta segundo núm

    long numIntroducido2 = segundoNum;
    long volteado2 = 0;
  
    while (numIntroducido > 0) {
      volteado2 = (segundoNum * 10) + (segundoNum % 10);
      volteado2 /= 10; 
    }


    long resultadoPar = 0;
    long resultadoImpar = 0;
    int digito ;
    for (int i = 0; i < longitud; i++) {
      digito = (int) (volteado1 % 10);

      if ((digito % 2) == 0) {
        resultadoPar = resultadoPar * 10 + digito;
      } else{
        resultadoImpar = resultadoImpar * 10 + digito;
      }

      digito = (int) (volteado2 % 10);

      if ((digito % 2) == 0) {
        resultadoPar = resultadoPar * 10 + digito;
      } else{
        resultadoImpar = resultadoImpar * 10 + digito;
      }

      volteado1 /= 10;
      volteado2 /= 10;
    }

  System.out.println("El número formado por los dígitos pares es: " + resultadoPar);
  System.out.println("El número formado por los dígitos impares es: " + resultadoImpar);

   


  }
}
