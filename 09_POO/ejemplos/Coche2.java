public class Coche2 extends Vehiculo{
  //Atributos 
  private String matricula;
  private String marca;
  private String modelo;
  

  //Constructor
  public Coche2(String matricula, String marca, String modelo) {
    super();
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
  }

  public void quemaRueda(){
    System.out.println("🛞💨 ñiaaaaa");
  }
 
}
