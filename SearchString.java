import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner searchsc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = searchsc.nextLine();
        System.out.println("Ingrese un caracter que desea encontrar");
        String caracter = searchsc.nextLine();
        int caracterfound = palabra.indexOf(caracter);
        if (caracterfound == -1) {
            System.out.println("No se ha encontrado el caracter");
        } else {
            System.out.println("Se ha encontrado el caracter en la posición: " + caracterfound);
        }
        searchsc.close();
    }
}
