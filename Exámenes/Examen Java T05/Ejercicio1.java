import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String apellido1;
    String apellido2;
    String nombre;

    System.out.print("Introduzca su primer apellido: ");
    apellido1 = sc.next();
    System.out.print("Introduzca su segundo apellido: ");
    apellido2 = sc.next();
    System.out.print("Introduzca su nombre: ");
    nombre = sc.next();

    String nombreCompleto = apellido1 + ", "+ apellido2 + ", " +nombre; // Nombre montado al completo
    int numeroLetras = nombreCompleto.length(); // Cuneta las letras del nombre al completo
    numeroLetras += 1;

    int notaPrimerTrimestre = 0;
    int notaSegundoTrimestre = 0;
    int notaTercerTrimestre = 0;
    String continuar;
    do {

      System.out.print("Introduce la nota obtenida en el primer trimestre: ");
      notaPrimerTrimestre = sc.nextInt();
      System.out.print("Introduce la nota obtenida en el segundo trimestre: ");
      notaSegundoTrimestre = sc.nextInt();
      System.out.print("Introduzca la nota obtenida en el tercer trimestre: ");
      notaTercerTrimestre = sc.nextInt();

      if (((notaPrimerTrimestre < 0) || (notaPrimerTrimestre > 10)) || ((notaSegundoTrimestre < 0) ||(notaSegundoTrimestre >10)) || ((notaTercerTrimestre <0) || (notaTercerTrimestre > 10))) {
        System.out.println("Has introducido datos erróneos!");
      }

    } while (((notaPrimerTrimestre < 0) || (notaPrimerTrimestre > 10)) || ((notaSegundoTrimestre < 0) ||(notaSegundoTrimestre >10)) || ((notaTercerTrimestre <0) || (notaTercerTrimestre > 10)));
    
    double media = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre)/3;


    System.out.print(" ");
    for (int i = 0; i <= numeroLetras; i++) { //Pintamos base superior
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.println();

    for (int i = 0; i < 1; i++) { //pintamos el medio
      System.out.print("|");
      System.out.print("\033[1m "+ nombreCompleto + " \033[0m");
      System.out.print("|");

      if (notaPrimerTrimestre >= 5) {
        System.out.print(" \033[32m"+ notaPrimerTrimestre + " \033[0m");
        System.out.print("|");
      }else{
        System.out.print(" \033[31m"+ notaPrimerTrimestre + " \033[0m");
        System.out.print("|");
      }
      
      if (notaSegundoTrimestre >= 5) {
        System.out.print(" \033[32m"+ notaSegundoTrimestre + " \033[0m");
        System.out.print("|");
      }else{
        System.out.print(" \033[31m"+ notaSegundoTrimestre + " \033[0m");
        System.out.print("|");
      }

      if (notaTercerTrimestre >= 5) {
        System.out.print(" \033[32m"+ notaTercerTrimestre + " \033[0m");
        System.out.print("|");
      }else{
        System.out.print(" \033[31m"+ notaTercerTrimestre + " \033[0m");
        System.out.print("|");
      }
    }
    System.out.println();

    System.out.print(" ");
    for (int i = 0; i <= numeroLetras; i++) { //Pintamos base inferior
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.println();

    System.out.print("¿Desea Continuar?: ");
    continuar = sc.next();
    if (continuar == "n") {
      System.out.println("Fin del programa");
    }
    

    do {
      System.out.print("Introduzca su primer apellido: ");
    apellido1 = sc.next();
    System.out.print("Introduzca su segundo apellido: ");
    apellido2 = sc.next();
    System.out.print("Introduzca su nombre: ");
    nombre = sc.next();

    nombreCompleto = apellido1 + ", "+ apellido2 + ", " +nombre; // Nombre montado al completo
    numeroLetras = nombreCompleto.length(); // Cuneta las letras del nombre al completo
    numeroLetras += 1;
      do {

      System.out.print("Introduce la nota obtenida en el primer trimestre: ");
      notaPrimerTrimestre = sc.nextInt();
      System.out.print("Introduce la nota obtenida en el segundo trimestre: ");
      notaSegundoTrimestre = sc.nextInt();
      System.out.print("Introduzca la nota obtenida en el tercer trimestre: ");
      notaTercerTrimestre = sc.nextInt();

      if (((notaPrimerTrimestre < 0) || (notaPrimerTrimestre > 10)) || ((notaSegundoTrimestre < 0) ||(notaSegundoTrimestre >10)) || ((notaTercerTrimestre <0) || (notaTercerTrimestre > 10))) {
        System.out.println("Has introducido datos erróneos!");
      }

    } while (((notaPrimerTrimestre < 0) || (notaPrimerTrimestre > 10)) || ((notaSegundoTrimestre < 0) ||(notaSegundoTrimestre >10)) || ((notaTercerTrimestre <0) || (notaTercerTrimestre > 10)));
    
     media = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre)/3;


    System.out.print(" ");
    for (int i = 0; i <= numeroLetras; i++) { //Pintamos base superior
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.println();

    for (int i = 0; i < 1; i++) { //pintamos el medio
      System.out.print("|");
      System.out.print("\033[1m "+ nombreCompleto + " \033[0m");
      System.out.print("|");

      if (notaPrimerTrimestre >= 5) {
        System.out.print(" \033[32m"+ notaPrimerTrimestre + " \033[0m");
        System.out.print("|");
      }else{
        System.out.print(" \033[31m"+ notaPrimerTrimestre + " \033[0m");
        System.out.print("|");
      }
      
      if (notaSegundoTrimestre >= 5) {
        System.out.print(" \033[32m"+ notaSegundoTrimestre + " \033[0m");
        System.out.print("|");
      }else{
        System.out.print(" \033[31m"+ notaSegundoTrimestre + " \033[0m");
        System.out.print("|");
      }

      if (notaTercerTrimestre >= 5) {
        System.out.print(" \033[32m"+ notaTercerTrimestre + " \033[0m");
        System.out.print("|");
      }else{
        System.out.print(" \033[31m"+ notaTercerTrimestre + " \033[0m");
        System.out.print("|");
      }
    }
    System.out.println();

    System.out.print(" ");
    for (int i = 0; i <= numeroLetras; i++) { //Pintamos base inferior
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.print(" ");
    for (int i = 0; i < 3; i++) {
      
      System.out.print("-");
    }

    System.out.println();

    System.out.print("¿Desea Continuar?: ");
    continuar = sc.next();
    
    } while (continuar.equals("s"));

    if (continuar == "n") {
      System.out.println("Fin del programa");
    }else{
      System.out.println("Error!");
    }
  }
  
}