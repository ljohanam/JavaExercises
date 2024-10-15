import java.util.Scanner;
public class Contrasenia {
    public static void main(String[] args) {
        Scanner contraseniasc = new Scanner(System.in);
    String contrasenia;
    contrasenia = "JavaCode";
    String contraseniaIng;
    System.out.println("Ingrese su contraseña ");
    contraseniaIng = contraseniasc.nextLine();
    if (contrasenia.equals(contraseniaIng)) {
    System.out.println("Ingresando al sistema... ");
    } else {System.out.println("Acceso invalido "); 
}
contraseniasc.close();
}
}
