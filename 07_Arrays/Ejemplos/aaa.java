public class aaa {
  public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 5};
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println(" ");
      desplazarIzquierda(array);
      for (int num : array) {
          System.out.print(num + " ");
      }
  }

  public static void desplazarIzquierda(int[] array) {

      int temp = array[0]; // Guardar el primer elemento en una variable temporal
      for (int i = 0; i < array.length - 1; i++) {
          array[i] = array[i + 1]; // Mover cada elemento una posición hacia la izquierda
      }
      array[array.length - 1] = temp; // Colocar el primer elemento en la última posición
  }
}
