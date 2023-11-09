import java.util.Scanner;

public class T03Ejercicio03 {
  public static void main(String[] args) {
    int pesetasAConvertir;
    Scanner sc = new Scanner(System.in);


    System.out.print("Por favor, introduzca la cantidad de pesetas que quiere convertir: ");
    pesetasAConvertir = sc.nextInt();
    double euros = (pesetasAConvertir / 166.386);     

    System.out.printf("%d pta --> %.2f €", pesetasAConvertir, euros);  

    sc.close();
  }
}