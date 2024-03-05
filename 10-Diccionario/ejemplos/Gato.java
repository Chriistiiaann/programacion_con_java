public class Gato implements Comparable<Gato> {
  private String nombre;
  private String color;
  private String raza;
  
  public Gato(String nombre, String color, String raza) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
  }
  
  public String getNombre() {
    return nombre;
  }

  public String getRaza() {
    return raza;
  }

  public String toString() {
    return "\nNombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza;
  }
  
  // public int compareTo(Gato g) {
  //   return (this.nombre).compareTo(g.getNombre());
  // }
  
  public boolean equals(Gato g) {
    return (this.nombre).equals(g.getNombre());
  }

  @Override
  public int compareTo(Gato o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
  }
}