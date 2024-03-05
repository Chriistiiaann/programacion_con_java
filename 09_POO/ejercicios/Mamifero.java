public class Mamifero extends Animal {

  ////Atributos

  private int patas;
  private String tipoMamifero;

  ////Constructores
  public Mamifero(String nombre, int edad, String sexo, int patas, String tipoMamifero) {
    super(nombre, edad, sexo);
    this.patas = patas;
    this.tipoMamifero = tipoMamifero;
  }

  public int getPatas() {
    return patas;
  }

  public String getTipoMamifero() {
    return tipoMamifero;
  }

  @Override
  public String toString() {
    return super.toString() + "\t[Mamifero] Patas: " + patas + "\tTipo de Mamífero: " + tipoMamifero;
  }

  

}
