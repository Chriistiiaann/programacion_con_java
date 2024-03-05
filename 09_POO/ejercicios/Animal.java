public class Animal {

  ////Atributos

  private String nombre;
  private int edad;
  private String sexo;
  

  ////Cosntructores

  public Animal (String nombre, int edad, String sexo){
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo; 
  }

  public String getNombre() {
    return nombre;
  }


  public int getEdad() {
    return edad;
  }


  public String getSexo() {
    return sexo;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + "\tEdad: " + edad + "\tSexo: " + sexo;
  }
  
}
