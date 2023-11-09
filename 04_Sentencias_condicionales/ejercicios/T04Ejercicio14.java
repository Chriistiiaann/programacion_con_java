import java.util.Scanner;
public class T04Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num;
    double numPar;
    double divisibleCinco;

    System.out.print("Introduce un número: ");
    num = sc.nextDouble();
    sc.close();
    numPar = num % 2;
    divisibleCinco = num % 5;

    if ((numPar !=0) && (divisibleCinco != 0)) {
      System.out.println("El número introducido no es impar ni divisible entre cinco");
      
    } else if ((numPar ==0) && (divisibleCinco !=0)) {
        System.out.println("El número introducido es par y no es divisible entre cinco"); 

    } else if ((numPar !=0) && (divisibleCinco ==0)) {
        System.out.println("El número introducido es impar y si es divisible entre 5");
        
    } else if ((numPar==0) && (divisibleCinco==0)) {
        System.out.println("El número introducido es par y divisible entre cinco");
    }
  } 
}
