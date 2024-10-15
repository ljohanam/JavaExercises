import java.util.Scanner;
public class TrimString {
    public static void main(String[] args) {
        Scanner spacesc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String fraseIng = spacesc.nextLine();
        System.out.println("La frase sin espacios es: " + fraseIng.trim());
        spacesc.close();
    }
}
