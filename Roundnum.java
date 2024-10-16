import java.util.Scanner;
public class Roundnum {
    public static void main(String[] args) {
        Scanner roundcs = new Scanner(System.in);
        System.out.println("Ingrese un número decimal");
        double numdecimal = roundcs.nextDouble();
        System.out.println("El número rendondeado de tu número ingresado es " + Math.round(numdecimal));
        roundcs.close();
    }
}