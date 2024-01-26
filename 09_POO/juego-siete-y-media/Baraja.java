public class Baraja {
  //Atributos
  String [] baraja = new String[40];

  //Método

  public void barajar(){
    int j = 0;
    for (int i = 0; i < baraja.length; i++) {
      do {
        baraja [i] = Carta.Math.random()
      } while (j == 40);
      j++;
    }
  }

  


}
