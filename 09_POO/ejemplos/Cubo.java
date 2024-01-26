public class Cubo {


  //Atributos
  private int capacidad; //Capacidad máxima
  private int contenido; //Contenido, actuan en litros

  //Constructores
  public Cubo(int cap){
    this.capacidad = cap;
  }

  //Getters
  public int getCapacidad(){
    return this.capacidad;
  }

  public int getContenido(){
    return this.contenido;
  }

  @Override
  public String toString() {
    return "Cubo [capacidad=" + capacidad + ", contenido=" + contenido + "]";
  }

  //Setters
  public void setContenido(int litros){
    this.contenido = litros;
  }

  //Métodos
  public void vacia(){
    this.contenido = 0;
  }

  public void llenar(){
    this.contenido = this.capacidad;
  }

  /**
  * Pinta el cubo en la pantalla.
  * Se muestran los bordes del cubo con el carácter # y el
  * agua que contiene con el carácter ~.
  **/
  public void pinta() {
    for (int nivel = this.capacidad; nivel > 0; nivel--) {
    if (this.contenido >= nivel) {
    System.out.println("#~~~~#");
    } else {
    System.out.println("#    #");
    }
    }
    System.out.println("######");
  }

  /**
  * Vuelca el contenido de un cubo sobre otro.
  * Antes de echar el agua se comprueba cuánto le cabe al
  * cubo destino.
  **/
  public void vuelcaEn(Cubo destino) {
    int libres = destino.getCapacidad() - destino.getContenido();
    if (libres > 0) {
      if (this.contenido <= libres) {
      destino.setContenido(destino.getContenido() + this.contenido);
      this.vacia();
      } else {
      this.contenido -= libres;
      destino.llenar();
      }
    } else {
      System.out.print("¿Qué quieres volcar?¿Aire?");
    }
  }
  
  


}
