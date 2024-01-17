public class PruebaGato {
  public static void main(String[] args) {
    // Gato garfield = new Gato("garfield", "Español", "Negro", "Macho", 6, 10);
    
    // Gato kitty = new Gato("kitty", "Español", "Negro", "Macho", 6, 18);
   
    // Gato missy = new Gato("missy", "Español", "Negro", "Macho", 8, 11);
   
    // Gato botas = new Gato("botas", "Español", "Negro", "Macho", 1, 5.6);
    
    // System.out.println(garfield.nombre);
    // System.out.println(garfield.color);
    // System.out.println(garfield.raza);
    // System.out.println(garfield.sexo);
    // System.out.println(garfield.edad);
    // System.out.println(garfield.peso);
  
    // garfield.maulla();
    // garfield.ronronea();
    // garfield.come("Pescado");
    // garfield.peleaCon(kitty);
    // kitty.peleaCon(missy);
    // botas.peleaCon(garfield);
  

    System.out.println("Cuántos gatos quieres crear: ");
    int num = Integer.parseInt(System.console().readLine());

    Gato[] gaticos = new Gato[num];
    String[] nombres = {"Gargield", "Botas", "Willy", "Pancho", "Misifú"};
    String[] colores = {"Marrón", "Negro", "Pardo"};


    for (int i = 0; i < num; i++) {
      int nombreAleatorio = (int)(Math.random()*5);
      int colorAleatorio = (int)(Math.random()*3);
      System.out.print("Que raza es");
      String raza = System.console().readLine();
      gaticos[i] = new Gato(nombres[nombreAleatorio], colores[colorAleatorio], raza, "Macho", 0, 0 );
    }

    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.out.println(gaticos[i].color);
    }

  }
}
