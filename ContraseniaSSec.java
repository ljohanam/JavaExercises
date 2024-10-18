import java.util.Scanner;

public class ContraseniaSSec {
    public static void main(String[] args) {
        Scanner contraseniasc = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String contrasenia = contraseniasc.nextLine();
    if (contrasenia.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        }
        boolean contieneMinuscula = false;
        boolean contieneMayuscula = false;
        boolean esNumero = false;
        boolean contienecarEspecial = false;
        for (int index = 0; index < contrasenia.length(); index++) {
            char letra = contrasenia.charAt(index);
            if (Character.isLowerCase(letra))
                contieneMinuscula = true;
            if (Character.isUpperCase(letra))
                contieneMayuscula = true;
            if (Character.isDigit(letra))
                esNumero = true;
            if (!Character.isLetterOrDigit(letra))
                contienecarEspecial= true;
        }
     if (contieneMinuscula && contieneMayuscula && esNumero && contienecarEspecial) {
     System.out.println("La contraseña es segura");
    } else {
        System.out.println("La contraseña debe tener al menos 1 número 1 letra mayúscula 1 letra minúscula y 1 caracter especial");
    }
    contraseniasc.close();
    }
}
