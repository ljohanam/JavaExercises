import java.util.Scanner;
public class DiaSem {
    public static void main(String[] args) {
        Scanner semcs = new Scanner(System.in);
        int dia;
        System.out.println("Ingrese un día de la semana entre 1 y 7 ");
        dia = semcs.nextInt();
        switch (dia) {
            case 1:
            System.out.println("Lunes");
                break;
            case 2:
                System.out.println("martes");
                    break;
            case 3:
            System.out.println("Miércoles");
                break;
            case 4:
            System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                    break;
            case 6:
                System.out.println("sábado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                break;
        }
    semcs.close();
}
}