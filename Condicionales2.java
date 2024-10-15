import java.util.Scanner;
public class Condicionales2 {
    public static void main(String[] args) {
        Scanner cond2sc = new Scanner(System.in);
       int edad;
       System.out.println("Ingrese su edad ");
       edad = cond2sc.nextInt();
    if (edad > 0){
        if (edad < 18) {
            System.out.println("eres menor de edad ");
        }
        else if (edad >= 65){
            System.out.println("eres un adulto mayor ");
        }
        else {
               System.out.println("Eres adulto ");
        }
       } else {System.out.println("su edad no puede ser negativa");}
    cond2sc.close();
}
}