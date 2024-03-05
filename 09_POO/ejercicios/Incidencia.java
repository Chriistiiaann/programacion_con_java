public class Incidencia {
  
  ////Atributos 
  private int codigo;
  private String estado;
  private int puesto;
  private String info;
  


  private static int i = 1;
  private static int pendientes = 0;
  ////Constructores

  public  Incidencia (int puesto, String info){
    this.puesto = puesto;
    this.info = info;
    this.estado = "Pendiente";
    this.codigo = i++;
    pendientes++;
  }

  public void resuelve(String resolucion){
    this.estado = "Resuelta";
    pendientes--;
  }

  @Override
  public String toString() {
    return "Incidencia: " + codigo + " - Puesto: " + puesto + " -  Información: " + info
        + " - " + estado;
  }

  static int getPendientes(){
    return pendientes;
  }

  


}
