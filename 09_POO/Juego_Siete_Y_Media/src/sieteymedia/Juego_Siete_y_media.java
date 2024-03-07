package sieteymedia;

public class Juego_Siete_y_media {
    public static void main(String[] args) {
        Baraja barajaEsp = new Baraja();
        Jugador jugador = new Jugador(0, 0);
        Mano manoJugador = new Mano();
        Carta cartaJugador;
        Carta cartaBanca;
        int contadorJugada = 1;
        boolean seguirJugando = true;

    do {    
            //Jugador
    
            System.out.println("\nBienvenido al maravilloso juego Siete y Media!!!!");
            
            barajaEsp.inicializaBaraja(); // Iniciamos la baraja.
            barajaEsp.barajar(); // Barajamos la bajara.
            System.out.println("La bajara ha sido mezclada.");
            
            System.out.println("\nEn la mesa tienes " + jugador.getSaldo() + " € para apostar, juega con cabeza!!!");
            boolean apuestaCorrecta = false;
    
            do {    
                System.out.println("¿Cuanto dinero quieres apostar?");
                jugador.setApuesta(Integer.parseInt(System.console().readLine()));
                
                apuestaCorrecta = false;
                if (jugador.getApuesta()> jugador.getSaldo()) {
                    System.out.println("No te pases de la raya, no tienes tanta pasta ratón.");
                    apuestaCorrecta = true;
                } else if (jugador.getApuesta() <= 0) {
                    System.out.println("Aqui nadie juega sin apostar.");
                    apuestaCorrecta = true;
                }
                jugador.retirarSaldo();
            } while (apuestaCorrecta != false);
            
            
           
            System.out.print("\nToma tu carta: "); 
            cartaJugador = barajaEsp.sacarCarta();
            barajaEsp.eliminarJugada();
            double puntuacion = cartaJugador.getPuntos();
            System.out.println("Total de puntos acumulados en esta ronda: " + puntuacion);
            
            
            
            boolean plantarse = false;
            String continuarJugando;
            do { 
                System.out.println("\n¿ Desea sacar otra carta ? (si/no)");
                continuarJugando = System.console().readLine();
    
                if (continuarJugando.equals("si")) {
                    int i = 2;
                    System.out.println("Toma tu " + i + "º carta: "); 
                    cartaJugador = barajaEsp.sacarCarta();
                    barajaEsp.eliminarJugada();
                    puntuacion += cartaJugador.getPuntos();
                    System.out.println("Total de puntos acumulados en esta ronda: " + puntuacion);
                    i++;
                    
                } else if (continuarJugando.equals("no")) {
                    System.out.println("");
    
                    //Banca
                    if ((puntuacion <= 7.5)) {
                            
                            cartaBanca = barajaEsp.sacarCarta();
                            barajaEsp.eliminarJugada();
                            double puntuacionBanca = cartaBanca.getPuntos();
                            System.out.println("La banca tiene: " + puntuacionBanca);
                
                        do {
                            int i = 2;
                            System.out.println(i + "º Carta de la banca: "); 
                            cartaBanca = barajaEsp.sacarCarta();
                            barajaEsp.eliminarJugada();
                            puntuacionBanca += cartaJugador.getPuntos();
                            System.out.println("La banca tiene: " + puntuacionBanca);
                            i++;
                        } while ((puntuacionBanca < 7.5));
    
                        if (puntuacionBanca > 7.5) {
                            System.out.println("Has ganado!!!");
                            jugador.apuestaGanadora();
                            System.out.println("Toma tu dinero " + jugador.getSaldo());
                            
                            
                        } else if (puntuacion < puntuacionBanca) {
                            System.out.println("Has perdido pringao!");
                            System.out.println("Tu saldo es: " + jugador.getSaldo());
    
                        } else if (puntuacion == 7.5) {
                            System.out.println("Has ganado Has ganado!!! (no te lo crees ni tu campeón)");
                            jugador.apuestaGanadora();
                            System.out.println("Toma tu dinero " + jugador.getSaldo());
                        }
    
                        
                    }
                    plantarse = true;
                } else {
                    System.out.println("Introduce: 'si' o 'no'");
                } 
    
                
                
            } while ((puntuacion < 7.5) && !plantarse);
    
            if (puntuacion > 7.5) {
                System.out.println("Has perdido pringao!");
                System.out.println("Tu saldo es: " + jugador.getSaldo()); 
            }   

            String volverJugar;
            if (jugador.getSaldo() > 0) {
                do {
                    System.out.println("¿Quieres seguir jugando? (si/no)");
                    volverJugar = System.console().readLine();
                    
                    if (volverJugar.equals("si")) {
                        seguirJugando = false;
                    } else if (volverJugar.equals("no")) {
                        seguirJugando = true;
                        
                    }
                } while (!(volverJugar.equals("si")) && !(volverJugar.equals("no")));
            } else {
                System.out.println("No puedes volver a jugar, la próxima juega con cabeza cabeza alcornoque.");
            }
   
    } while ((jugador.getSaldo() > 0) && !seguirJugando);       
    }
}
