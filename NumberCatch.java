import java.util.Scanner;

public class NumberCatch {
public static void main(String[] args) {
Scanner tcld = new Scanner(System.in);
String numeroTexto;
int numero = 0;
System.out.println("Ingrese un número");
try {
numeroTexto = tcld.nextLine();
numero = Integer.parseInt(numeroTexto);
System.out.println("El número ingresado es: "+numero);
} catch (NumberFormatException e) {
System.out.println("Ha ingresado una cadena de caracteres que no corresponde a un número.");
}

tcld.close();
}
}