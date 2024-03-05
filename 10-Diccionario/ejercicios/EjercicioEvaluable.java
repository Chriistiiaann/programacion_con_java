import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class EjercicioEvaluable {
  public static void main(String[] args) {
    //10 Países
    HashMap<String, String> pais = new HashMap<String, String>();
    pais.put("España","Madrid");
    pais.put("Albania","Tirana");
    pais.put("Alemania","Berlín");
    pais.put("Bélgica","Bruselas");
    pais.put("Chipre","Nicosia");
    pais.put("Eslovenia","Liubliana");
    pais.put("Letonia","Riga");
    pais.put("Macedonia del Norte","Skopie");
    pais.put("Reino Unido","Londres");
    pais.put("Suiza","Berna");
    
    //20 Respuestas Incorrectas
    ArrayList<String> respuestasIncorrectas = new ArrayList<String>();
    respuestasIncorrectas.add("Vilna");
    respuestasIncorrectas.add("Luxemburgo");
    respuestasIncorrectas.add("Varsovia");
    respuestasIncorrectas.add("San Marino");
    respuestasIncorrectas.add("Belgrado");
    respuestasIncorrectas.add("Kiev");
    respuestasIncorrectas.add("Vaduz");
    respuestasIncorrectas.add("Viena");
    respuestasIncorrectas.add("Zagreb");
    respuestasIncorrectas.add("Tiflis");
    respuestasIncorrectas.add("Atenas");
    respuestasIncorrectas.add("Oslo");
    respuestasIncorrectas.add("Ankara");
    respuestasIncorrectas.add("Tallín");
    respuestasIncorrectas.add("París");
    respuestasIncorrectas.add("Helsinki");
    respuestasIncorrectas.add("Roma");
    respuestasIncorrectas.add("Nursultán");
    respuestasIncorrectas.add("La Valeta");
    respuestasIncorrectas.add("Praga");
    respuestasIncorrectas.add("Amsterdam");

    int paisSwitch = 0;
    int paisSwitchCopia = 0;
    String respuesta = null;
    String Pais = null;
    int aciertos = 0;
    for (int j = 10; j > 0; j--) {
      

      paisSwitch = (int)(Math.random()*9);
   
          do {
            
            
            switch (paisSwitch) {
              case 0:
                Pais = "España";
                break;
              case 1:
                Pais = "Albania";
                break;
              case 2:
                Pais="Alemania";
                break;
              case 3:
                Pais="Bélgica";
                break;
              case 4:
                Pais="Chipre";
                break;
              case 5:
                Pais="Eslovenia";
                break;
              case 6:
                Pais="Letonia";
                break;
              case 7:
                Pais="Macedonia del Norte";
                break;
              case 8:
                Pais="Reino Unido";
                break;
              case 9:
                Pais="Suiza";
                break;
              default:
                break;
            }
            paisSwitch = paisSwitchCopia;
          } while (paisSwitch==paisSwitchCopia);
   
      
     
      
      Collections.shuffle(respuestasIncorrectas);
      System.out.println("¿Cuál es la capital de " + Pais + "?");
      System.out.println();
      for (int i = 1; i < 3; i++) {
        int numero = (int)(Math.random()*j);
        
        System.out.println(i + ". " + respuestasIncorrectas.get(numero));

        respuestasIncorrectas.remove(numero);
      }
      System.out.println("3" + ". " + pais.get(Pais));
      System.out.println("");
      System.out.print("Respuesta: ");
      respuesta = System.console().readLine();
      if (respuesta.equals(pais.get(Pais))) {
        aciertos++;
      } 
    }
    if (aciertos >= 5) {
      System.out.println("¡Enhorabuena! ¡Has aprobado! Puntuacion: " + aciertos);
    }else{
      System.out.println("¡Sigue Intentándolo!");
    }

  }
}
