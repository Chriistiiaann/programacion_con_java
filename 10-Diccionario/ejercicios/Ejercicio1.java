import java.util.HashMap;
/**
 * Programa que gestiona usuarios de una zona restringida.
 * Se dispone de tres intentos.
 * 
 * @author Christian Rodríguez Lara
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    HashMap<String , String> bbdd= new HashMap<>();
    String usuario;
    String pass;
    boolean accede = false;
    int intentos = 3;

    bbdd.put("admin", "3355");
    bbdd.put("funalito", "1255");
    bbdd.put("morris", "abcd");
    bbdd.put("menganito", "78ab");

    do {
      System.out.print("Por favor, introduce el nombre de usuario: ");
      usuario = System.console().readLine();
      System.out.print("Introduce la contraseña: ");
      pass = System.console().readLine();

      if (bbdd.containsKey(usuario)) { //El usuario existe
        if (bbdd.get(usuario).equals(pass)) { //La contraseña coincide
          System.out.print("Bienvenido a su área privada");
          accede = true;
        } else{
          System.out.println("Contraseña Incorrecta");
          intentos --;
        }
      } else{
        System.out.println("Usuario no registrado");
        intentos--;
      }

      if (!accede && intentos > 0) {
        System.out.println("Le quedan " + intentos + " intentos");
      }
      
    } while (!accede && intentos > 0);

    if (!accede) {
      System.out.println("Lo sentimos pero no tiene acceso al área privada");
    }

  }
}
