import java.util.Scanner;

public class AñoNasCal {
    public static void main(String[] args) {
        Scanner aniosc = new Scanner(System.in);
        System.out.println("¿Cual es tu año de nacimiento?");
        int anionas = aniosc.nextInt();
        System.out.println("¿Cual es el año actual?");
        int anioact = aniosc.nextInt();
        int edad = anioact - anionas;
        boolean mayordeedad = edad >= 18;
        if (mayordeedad == true) {
            System.out.println("Eres mayor de edad ya que tu edad es: " + edad);
        } else {
            System.out.println("Eres menor de edad ya que tu edad es: " + edad);
        }
        aniosc.close();
    }
}