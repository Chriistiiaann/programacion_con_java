import java.util.Scanner;
public class Ejercicio5 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int dias;
  int año;
  int dia;
  int mes;

  System.out.printf("\033[1mCALCULADORA DE TIEMPO\033[0m\n");
  System.out.printf("===============================================\n");
  System.out.print("Introduce una cantidad de días: ");

  dias = sc.nextInt();
  año = dias/360;
  mes = (dias - (año*365))/30;
  dia = (dias - ((año*365)+(mes*30)));
  sc.close();
 System.out.printf(dias + " días son \033[0;41m\033[1;37m"+ año + " años\033[0m, \033[48;5;11m"+ mes + " meses\033[0m" + " y \033[48;5;10m" + dia + " días \033[0m");

}
}
