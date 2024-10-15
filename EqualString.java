import java.util.Scanner;
public class EqualString {
    public static void main(String[] args) {
    Scanner equalsc = new Scanner(System.in);
System.out.println("Ingrese una palabra");
String palabra1 = equalsc.nextLine();
System.out.println("Digite nuevamente la palabra");
String palabra2 = equalsc.nextLine();
if (palabra1.equals(palabra2)) {
    System.out.println("Las palabras son iguales");
} else {
        System.out.println("Las palabras no coinciden");
}
equalsc.close();
    }
}
