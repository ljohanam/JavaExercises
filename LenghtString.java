import java.util.Scanner;

public class LenghtString {
    public static void main(String[] args) {
        Scanner lengthsc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = lengthsc.nextLine();
        int longitud = frase.length();
        System.out.println("La frase tiene " + longitud + " caracteres");
        lengthsc.close();
    }
}
