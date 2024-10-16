import java.util.Scanner;
public class SqrtMath {
    public static void main(String[] args) {
        Scanner sqrtsc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int num = sqrtsc.nextInt();
        System.out.println("La raiz cuadrada de tu número ingresado es: " + Math.sqrt(num));
        sqrtsc.close();
    }
}
