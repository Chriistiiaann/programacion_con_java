public class Libro extends Publicacion implements Prestable{

  ////Atributos
  private boolean prestado = false; //No esta prestado en un principio

  ////Constructores
  public Libro(String codIsbn, String titulo, int añoPublicacion) {
    super(codIsbn, titulo, añoPublicacion);
    
  }


  ////Métodos
  public void presta(){
    prestado = true;
  }

  public void devuelve(){
    prestado = false;
  }

  public boolean estaPrestado(){
    if (prestado = true) {
      System.out.print("Losiento, ese libro ya esta prestado");
    }
    return prestado; 
  }


  @Override
  public String toString() {
    return super.toString();
  }
  
  


 
}

  
 

  

  

  

