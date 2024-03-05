public class Publicacion {
  //Atributos

  private String codIsbn;
  private String titulo;
  private int añoPublicacion;

  //Constructores

  public Publicacion(String codIsbn, String titulo, int añoPublicacion){
    this.codIsbn = codIsbn;
    this.titulo = titulo;
    this.añoPublicacion = añoPublicacion;
  }

  //toString
  @Override
  public String toString() {
    return "ISBN: " + codIsbn + ", título: " + titulo + ", año de publicación: " + añoPublicacion;
  }

  
  
  


}
