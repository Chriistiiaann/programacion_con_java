import java.util.Scanner;
public class T04Ejercicio15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);   
         String caracter;
         int opcionElegida;

         System.out.print("Introduzca con que carácter quiere realizar la pirámide: ");
         caracter = sc.next();
         System.out.println("¿De qué forma quiere que sepinte su pirámide?");
         System.out.println("1. Vértice hacia arriba");
         System.out.println("2. Vértice hacia abajo");
         System.out.println("3. Vértice hacia la izquierda");
         System.out.println("4. Vértice hacia la derecha");
         System.out.print("Introduzca que opción desea realizar: ");
         opcionElegida = sc.nextInt();
        sc.close();

        switch (opcionElegida) {
        case 1:
            System.out.println("     "+caracter);
            System.out.println("    "+caracter+caracter+caracter);
            System.out.println("   "+caracter+caracter+caracter+caracter+caracter);
            System.out.println("  "+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
            System.out.println(" "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
            break;
        case 2:
            System.out.println(" "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
            System.out.println("  "+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
            System.out.println("  "+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
            System.out.println("   "+caracter+caracter+caracter+caracter+caracter);
            System.out.println("    "+caracter+caracter+caracter);
            System.out.println("     "+caracter);
            break;
        case 3:
            System.out.println("    "+caracter);
            System.out.println("    "+caracter+caracter+caracter);
            System.out.println("   "+caracter+caracter+caracter+caracter+caracter);
            System.out.println("  "+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
            System.out.println(" "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
            break;
        case 4: 
            System.out.println("      "+caracter);
            System.out.println("    "+caracter+caracter+caracter);
            System.out.println("   "+caracter+caracter+caracter+caracter+caracter);
            System.out.println("  "+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
            System.out.println(" "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
            break;
        default:
            System.out.println("Introduzca un dato correcto");
            break;
     }


    }
}
