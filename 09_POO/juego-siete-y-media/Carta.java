public class Carta {
  
  public static final String Math = null;
  public static double orden;
  //Atributos
  String [] carta = new String [40];
  String [] palos = {"oro", "bastos", "espadas", "copas"};
  String [] valores = {"1", "2","3","4","5","6", "7", "Sota", "Caballo", "Rey",};
  int [] puntuacion = new int[10];
  

  //Métodos

  
  // public void puntuacion(){
    
  //   for (int i = 0; i < puntuacion.length; i++) {
  //     for (int k = 0; k < puntuacion.length; k++) {
  //       switch (puntuacion[k]) {
  //         case 0,1,2,3,4,5,6:
  //           puntuacion[k] = k;
  //           break;
  //         case 7,8,9:
  //           puntuacion[k] = (int) 0.5;
  //         default:
  //           break;
  //       }
  //     }
  //   }
  // }

  public void orden(){
    int j = 0;
    do {
      for (int i = 0; i < valores.length; i++) { 
      System.out.println(carta [i] = valores[i] + " de " + palos[j]);
      } 
      j++;
    } while (j < palos.length); 
    
  }


 

 
}
