import java.util.Scanner;
public class AbsMath {
    public static void main(String[] args) {
        Scanner abscs = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número entero");
        num = abscs.nextInt();
        System.out.println("El valor absoluto de tu número ingresado es" + num + " es: " + Math.abs(num));
        abscs.close();
    }
}
