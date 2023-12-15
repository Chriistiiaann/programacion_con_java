public class repaso {
  public static void main(String[] args) {
    
    long numIntroducido = 0;

    System.out.print("Introduzca un número entero positivo: ");
    numIntroducido = Long.parseLong(System.console().readLine());

    // Vuelta al número
    long num = numIntroducido;
    long numVolteado = 0;
    int longitud = 0;

    if (num == 0) {
      longitud = 1;
    }

    while (num > 0) {
      numVolteado = (numVolteado * 10) + (num % 10);
      num /= 10;
      longitud ++;
    }

    // Mostrar Número pares

    System.out.print("Números pares: ");
    int digito;
    int sumaPares = 0;

    for (int i = 0; i < longitud; i++) {
      digito = (int) (numVolteado % 10);

      if ((digito % 2) == 0) {
        System.out.print(digito +" ");
        sumaPares += digito;
      }
      numVolteado /= 10;
    }

    System.out.print("\n Suma de los dígitos pares: "+ sumaPares);




  }
}
