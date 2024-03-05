package sieteymedia;

public class Jugador {
    private int saldo;
    private int apuesta = 0;


    public Jugador(int saldo, int apuesta) {
        this.saldo = 100;
        this.apuesta=apuesta;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getApuesta() {
        return apuesta;
    }


    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void retirarSaldo(){
        this.saldo -= getApuesta();
    }

    public void apuestaGanadora(){
        this.saldo += this.apuesta*2;
    }

    




}