import java.util.Scanner;
public class T04Ejercicio16 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      int puntos = 0;
      String opcionElegida;

      System.out.println("¿Te está siendo tu pareja infiel?");
      System.out.println("Responda a las preguntas con Verdadero o Falso");
      System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }
      System.out.print("2. Ha aumentado sus gastos de vestuario ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }
      System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }
      System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer) ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }
      System.out.print("5. No te deja que mires la agenda de su teléfono móvil ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }
      System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }
      System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }
      System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }
      System.out.print("9. Has notado que últimamente se perfuma más ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }
      System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo ");
      opcionElegida = sc.next();
      if (opcionElegida.equals("Verdadero")) {
        puntos = puntos +3;
      }

      sc.close();
      System.out.println(" ");
      if (puntos <= 10) {
        System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");
      }else if ((puntos >10) && (puntos <22)) {
        System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
      }else if (puntos >=22) {
        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      }
    }

    
}
