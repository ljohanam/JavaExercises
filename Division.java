import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número: ");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese un segundo número: ");
            int num2 = scanner.nextInt();
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error inesperado " + e.getMessage());
        }

        scanner.close();
    }
}