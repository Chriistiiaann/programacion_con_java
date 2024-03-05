/**
 * Clase estudiante que hereda de la calse Persona
 * 
 * @author Christian Rodríguez Lara
 */
public class Estudiantes  extends Persona{

  ////Atributos
  private int creditos;

  ////Constructores
  public Estudiantes(String nombre, int edad, String dni) {
    super(nombre, edad, dni);
    this.creditos = 60;
    
  }

  public Estudiantes(String nombre, int edad, String dni, int creditos) {
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  public int getCreditos() {
    return creditos;
  }

  @Override
  public String toString() {
    return super.toString() + "\t[Estudiante] Créditos: " + creditos;
  }

  // public void mostrarDatos(){
  //   super.mostrarDatos();     //Llamo a mostrarDatos de la superclase "Persona"
  //   System.out.println("Estudiante matriculado de " + creditos + " créditos.");
  // }
  
}
