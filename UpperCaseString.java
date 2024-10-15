import java.util.Scanner;
public class UpperCaseString {
    public static void main(String[] args) {
        Scanner fraseupcasesc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = fraseupcasesc.nextLine();
        System.out.println("Su frase en mayúsculas es: " +frase.toUpperCase());
        fraseupcasesc.close();
    }
    
}
