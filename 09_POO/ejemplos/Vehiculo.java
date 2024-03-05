public abstract class Vehiculo {
  ////Atributos de clase
  private static int vehiculoCreados = 0;
  private static int kilometrosTotal = 0;

  ////Atributos de instancia(objeto)
  private int kilometrosRecorridos;

  ////Constructor
  public Vehiculo(){
    this.kilometrosRecorridos = 0;
    vehiculoCreados++;
  }

  public int getKilometrosRecorridos(){
    return this.kilometrosRecorridos;
  }

  //Método
  public void recorre(int km){
    this.kilometrosRecorridos += km;
    kilometrosTotal += km;
  }
  
  ////Método de clase(static)
  public static int getKilometrajeTotal(){
    return kilometrosTotal;
  }
}
