package sieteymedia;

public class Mano {

private int puntuacionMano;


    public void setPuntuacionMano(int puntuacionMano) {
        this.puntuacionMano = puntuacionMano;
    }

    public int getPuntuacionMano() {
        return puntuacionMano;
    }

    public void puntuacionTotal(Carta carta){
        
        puntuacionMano += carta.getPuntos();    
    }
   
}
