import java.util.Scanner;
public class substringfrase {
    public static void main(String[] args) {
        Scanner substringsc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = substringsc.nextLine();
        System.out.println("Ingrese una posición inicial y una posición final para extraer la frase");
        int inicio = substringsc.nextInt();
        int fin = substringsc.nextInt();
        System.out.println(frase.substring(inicio,fin));
        substringsc.close();
    }
}
