package sieteymedia;

public class Baraja {

  ////Atributos
  private String [] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private String [] valores = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
  private Carta[] cartas;
  private int numCartas;

  ////Constructor
  public Baraja(){
    numCartas = this.palos.length * this.valores.length; //4 * 10 = 40, se crea para que se generen las cartas necesarias
    cartas = new Carta[numCartas];
    inicializaBaraja();
  }

  ////Métodos
  public void inicializaBaraja(){
    int indice = 0;
    while (indice < numCartas) {
      for (int i = 0; i < palos.length; i++) {
        for (int j = 0; j < valores.length; j++) {
          cartas[indice] = new Carta(valores[j], palos[i], puntuacionCartas(j));
          indice++;
        }
      }
    }
  }
  

  public double puntuacionCartas(int j){
      if (j<7) {
        return j+1;
      }else{
        return 0.5;
      }
      // return j<7 ? j+1 : 0.5; --> Otra forma de poner un ifelse  
  }

  public void mostrarBaraja(){
    for (int i = 0; i < cartas.length; i++) { // Támbien podemos poner hasta numCartas, es lo mismo
      System.out.printf("%-20s Puntuación: %.1f\n",cartas[i].toString(), cartas[i].getPuntos());
    }
    
  }
  
  public void barajar(){
    int posAleatoria = 0;
    Carta c;
    for (int i = 0; i < cartas.length; i++) {

      posAleatoria = (int) (Math.random() * 40);

      //intercambio
      c = cartas[i];
      cartas[i] = cartas[posAleatoria];
      cartas[posAleatoria] = c; 
    }
    
  }

  public void eliminarJugada(){
    System.out.printf("%-20s Puntuación: %.1f\n",cartas[0].toString(), cartas[0].getPuntos());
    Carta temp = cartas[0]; // Guardar el primer elemento en una variable temporal
    for (int i = 0; i < cartas.length - 1; i++) {
        cartas[i] = cartas[i + 1]; // Mover cada elemento una posición hacia la izquierda
    }
    cartas[cartas.length - 1] = temp; // Colocar el primer elemento en la última posición
    
  }

  
  public Carta sacarCarta(){
    return cartas[0];
  }


}