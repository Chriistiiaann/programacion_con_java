public class PruebaVehiculos {
  public static void main(String[] args) {
    Coche2 toyota = new Coche2("1234ABC", "Toyota", "Supra");
    Bicicleta bh = new Bicicleta("BH");

    int opcion = 0;
    int km = 0;
    while (opcion !=8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.err.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");

      System.out.println("Elige una opción (1-8):");
      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
            System.out.println("¿Cuántos kilómetros quieres recorrer?");
            km = Integer.parseInt(System.console().readLine());
            
          break;
      
        default:
          break;
      }
    }
  }
}
