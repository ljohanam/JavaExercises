import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner calics = new Scanner(System.in);
        int notas;
        System.out.println("Ingrese la nota obtenida en una escala de 1 a 5 ");
        notas = calics.nextInt();
        switch (notas) {
            case 1:
            System.out.println("Muy Deficiente");
                break;
            case 2:
                System.out.println("Deficiente");
                    break;
            case 3:
            System.out.println("Suficiente");
                break;
            case 4:
            System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                    break;
                       default:
                break;
        }
    calics.close();
}
}

