package sieteymedia;

public class Carta {


  ////Atributos
  private String numero;
  private String palo;
  private double puntos;

  ////Constructor
  public Carta(String numero, String palo, double puntos) {
    this.numero = numero;
    this.palo = palo;
    this.puntos = puntos;
  }


  ////Getter
  public String getNumero() {
    return this.numero;
  }

  public String getPalo() {
    return this.palo;
  }

  public double getPuntos() {
    return this.puntos;
  }

  ////
  @Override
  public String toString() {
    return String.format("%s del %s", this.numero, this.palo);
  }

  
  

  


}
