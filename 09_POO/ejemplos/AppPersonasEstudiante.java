/**
 * Clase que contendrá el método main para probar la herencia 
 * 
 * @author Christian Rodríguez Lara
 */
public class AppPersonasEstudiante {
  public static void main(String[] args) {
    Persona p = new Persona("Pepe Rodríguez", 30, "456789123G");
    Estudiantes e = new Estudiantes("Paula Gómez", 21, "123987456H");
    Profesor prof = new Profesor("Sergio Sánchez", 34, "123456987L", "Informática", 10000.25);

   System.out.println(p.toString());
   System.out.println(p);

   System.out.println(e.toString());
   System.out.println(e);

   System.out.println(prof.toString());
   System.out.println(prof);

   
  }
}
