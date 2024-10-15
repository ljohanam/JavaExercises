import java.util.Scanner;
public class SpacesTrim {
    public static void main(String[] args) {
        Scanner spacesc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = spacesc.nextLine();
        String frasetrim = frase.replace(" ", "");
        System.out.println("La longitud de la frase sin espacios es: " + frasetrim.length());
        spacesc.close();
    }
}
