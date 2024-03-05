public class PruebaCoche2 {
  public static void main(String[] args) {
    Coche cocheDeLuis = new coche2("Saab", "93");
    Coche cocheDeJuan = new coche2("Toyota", "Avensis");
    cocheDeLuis.recorre(30);
    ocheDeLuis.recorre(40);
    cocheDeLuis.recorre(220);
    cocheDeJuan.recorre(60);
    cocheDeJuan.recorre(150);
    cocheDeJuan.recorre(90);
    System.out.println("El coche de Luis ha recorrido " + cocheDeLuis.getKilometraje() + "Km");
    System.out.println("El coche de Juan ha recorrido " + cocheDeJuan.getKilometraje() + "Km");
    System.out.println("El kilometraje total ha sido de " + Coche.getKilometrajeTotal() + "Km"\
  }
}
