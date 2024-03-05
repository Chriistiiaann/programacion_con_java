import java.util.HashMap;

public class EjemploHashmap02 {
  public static void main(String[] args) {
    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.print("Los elementos de m utilizando entrySet son: \n" + m.entrySet());
   
    System.out.println("\n\nEntradas del diccionario extraídas una a una:");
    for (int key : m.keySet()) {
      System.out.println(key + "=" + m.get(key));
    }
  }
}
