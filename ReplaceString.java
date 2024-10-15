import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner replacesc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = replacesc.nextLine();
        System.out.println(
                "Ingrese un primer caracter que desea remplazar y un segundo caracter por el cual lo quieres remplazar");
        String caracter1 = replacesc.nextLine();
        String caracter2 = replacesc.nextLine();
        System.out.println("su frase remplazada es: " + frase.replace(caracter1, caracter2));
        replacesc.close();
    }
}
