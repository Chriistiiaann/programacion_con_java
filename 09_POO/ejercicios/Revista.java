public class Revista extends Publicacion{

  ////Atributos
  private int numero;

  //// Constructores
  public Revista(String codIsbn, String titulo, int añoPublicacion, int numero) {
    super(codIsbn, titulo, añoPublicacion);
    this.numero = numero;
  }


  ////Getters
  public int getNumero() {
    return numero;
  }

  ////Setters
  public void setNumero(int numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    return super.toString() + String.format(", ", numero);
  }

  
  
  
}
