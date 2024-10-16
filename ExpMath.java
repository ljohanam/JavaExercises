import java.util.Scanner;
public class ExpMath {
    public static void main(String[] args) {
        Scanner expsc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base");
        int base = expsc.nextInt();
        System.out.println("Ingrese el valor del exponente");
        int exponente = expsc.nextInt();
        System.out.println("El valor de la potencia es: " + Math.pow(base, exponente));
        expsc.close();
        }
}
