import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {
        Scanner semcs = new Scanner(System.in);
        int dia;
        System.out.println("Ingrese un día de la semana entre 1 y 7 ");
        try {
            dia = semcs.nextInt();
            switch (dia) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("día hábil");
                    break;
                case 6:
                case 7:
                    System.out.println("día no hábil");
                default:
                    System.out.println("Fuera del rango de 1 a 7");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Ingresó una opción incorrecta");
        }
        semcs.close();
    }
}