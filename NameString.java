import java.util.Scanner;
public class NameString {
    public static void main(String[] args) {
        Scanner namesc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = namesc.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = namesc.nextLine();
        System.out.println("Hola " + name.concat(" " +apellido) + "!");
        namesc.close();

    }
}