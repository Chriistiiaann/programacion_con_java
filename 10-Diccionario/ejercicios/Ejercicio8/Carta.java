package Ejercicio8;
/**
 * 
 * 
 * 
 * @author Christian Rodríguez Lara
 */
public class Carta {
  private static String[] palos = {"Oros", "Bastos", "Espadas", "Copas"};
  private static String[] numero = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

  private String palo;
  private String valor;

  ////Constructores

  public Carta(){
    this.palo = palos[(int)(Math.random()*4)];
    this.valor = numero[(int)(Math.random()*10)];
  }

  public String getPalo() {
    return palo;
  }

  public String getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return valor + " de " + palo;
  }

  
}
