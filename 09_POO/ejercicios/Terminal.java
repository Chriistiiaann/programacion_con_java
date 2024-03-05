public class Terminal {

  ////Atributos

  private String numero;
  private int tiempoConversacion; //Segundos

  ////Constructores

  public Terminal(String numero){
    this.numero=numero;
  }

  ////Getters

  public String getNumero() {
    return numero;
  }

  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  ////Setters

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " - " + tiempoConversacion + " de conversación";
  }

  public void llama(Terminal t, int tiempoConversacion){
    this.tiempoConversacion += tiempoConversacion; //Acumulo a lo que ya estubiese
    t.tiempoConversacion += tiempoConversacion;
  }

  

  

  
  

  
}
