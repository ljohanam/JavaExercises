import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la temperatura: ");
        try {
            double temp = sc.nextDouble();
            System.out.println(
                    "ingreses la unidad de medida en C (para grados centígrados) o en F (para grados fahrenheits): ");
            if (sc.nextLine().equals("C")) {
                System.out.println("su temperatura Farenheits convertida a Grados Fahrenheits: " + (temp * 9 / 5 + 32));
            } else if (sc.nextLine().equals("F")) {
                System.out.println(
                        "su temperatura Farenheits convertida a Grados centígrados es: " + (temp - 32) * 5 / 9);
            } else {
                // Manejar caso de unidad no válida
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (Exception e) {
            // Manejar errores de entrada, como ingresar un valor no numérico
            System.out.println("Error: Entrada no válida. Asegúrese de ingresar un número para la temperatura.");
        } finally {
            sc.close(); // Cerrar el scanner en el bloque finally para asegurarse de que siempre se
                        // cierra
        }
    }
}
