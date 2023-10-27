/**
 * Explica tu código aquí
 * 
 * @author Christian Rodríguez Lara
 */
public class Ejemplo01{

  public static void main(String[] args) {
    
    //Tipo byte

    byte miNumByte = 100;
    System.out.println(miNumByte);
  
    //Tipo short
    short miNumShort = 5000;
    System.out.println(miNumShort);

    //Tipo long 
    long miNumLong = 150000000L;
    System.out.println(miNumLong);

    //Tipo float
    float miNumFloat = 5.75f;
    System.out.println(miNumFloat);

    //Tipo boolean
    boolean esJavaDivertido = true;
    boolean esElProfeDivertido = false;
    System.out.println(esJavaDivertido);
    System.out.println(esElProfeDivertido);



    int numero = 5;

    System.out.println("El valor de una variable es "+ numero);

    double x;
    double y;

    x = 7;
    y = 25.75;

    System.out.println("x vale " + x);
    System.out.println("y vale " + y);


    char letra1 = 99; // El 99 es el valor en "ASCII" de la letra "C"
    char letra2 = 97;
    System.out.println(letra1);
    System.out.println(letra1 + letra2); //No suma las letras, suma los valores de la letra en ASCII
    System.out.println(letra1 + "" + letra2); //Suma las letras y no el valor de la letra 

    String miString = "a";
    char letraA = 'a';
    System.out.println(miString);
    System.out.println(letraA);

    int num1 = 9;
    int num2 = 2;

    System.out.println(num1%num2);
    System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es = " + num1%num2);

    int a = 2;
    int b = 9;

    double division;

    System.out.println("el casting de la variable b: " + (double) b);
  }
}