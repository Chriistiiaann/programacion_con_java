package matematicas;

/**
 * Funciones matemáticas para realizar áreas
 * 
 * @author Christian Rodríguez Lara
 */
public class Area {

  // Devuelve el area de un cuadrado
  
  public static double areaCuadrado(double l) {
    return Math.pow(l, l);
  }

  // Devuelve el area de un rectángulo

  public static double areaRectangulo(double b, double h) {
    return b * h;
  }

  // Devuelve el area de un círculo
  public static double areaCirculo(double r) {
    return Math.PI * r * r;
  }
}
