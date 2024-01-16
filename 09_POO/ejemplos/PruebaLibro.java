
/**
 * La clase que contendrá el método principal o main
 * 
 * @author Christian Rodríguez Lara
 */
public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Morris Morrison";
    lib.numeroPaginas = 333;
    System.out.println("Título: " + lib.titulo);
    System.out.println("Autor: " + lib.autor);
    System.out.println("Número de páginas: " + lib.numeroPaginas);
    System.out.println("Edición: " + lib.edicion);
  }
}
