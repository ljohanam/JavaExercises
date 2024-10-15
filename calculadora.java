import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner calcscs = new Scanner(System.in);
int num1;
int num2;
int select;
String frase = "Su resultado es: ";
System.out.println("Ingrese un primer número ");
num1 = calcscs.nextInt();
System.out.println("Ingrese un segundo número ");
num2 = calcscs.nextInt();
System.out.println("Ingrese una opción para la operación que desea ejecutar ");
System.out.println("\n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División");
select = calcscs.nextInt();
switch (select) {
    case 1:
    System.out.println(frase +(num1+num2));
        break;
    case 2:
    System.out.println(frase +(num1-num2));
        break;
    case 3:
    System.out.println(frase +num1*num2);
        break;
    case 4:
       System.out.println(frase +num1/num2);
    default:
        break;
}
calcscs.close();
}
}
