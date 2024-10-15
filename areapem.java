import java.util.Scanner;
public class areapem {
    public static void main(String[] args) {
        Scanner areapemsc = new Scanner(System.in);
        int fig;
        int rad;
        int areaper;
        double base;
        double alt;
        double per;
        double area;
        System.out.println("\n Ingrese la figura que desea, \n 1. círculo \n 2. rectángulo");
        fig = areapemsc.nextInt();
        switch (fig) {
            case 1:
            System.out.println("Ingrese el valor del radio del círculo");
            rad = areapemsc.nextInt();
            System.out.println("\n Desea conocer: \n 1. área \n 2. perímentro");
            areaper = areapemsc.nextInt();
            if (areaper == 1) {
                area = Math.PI*Math.pow(rad,2);
                System.out.println("el área del círculo es " +area);
            } else if (areaper == 2) {
            per = 2* Math.PI*rad;
            System.out.println("el perímetro del círculo es " +per);
            }
                break;
        case 2:
        System.out.println("Ingrese el valor de la base del rectángulo");
        base = areapemsc.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        alt = areapemsc.nextDouble();
        System.out.println("\n Desea conocer: \n 1. área \n 2. perímentro");
        areaper = areapemsc.nextInt();
            if (areaper == 1) {
                area = base*alt;
                System.out.println("el área del rectángulo es " +area);
            } else if (areaper == 2) {
            per = 2*base + 2*alt;
            System.out.println("el perímetro del rectángulo es " +per);
            }
                break;
            default:
                break;
        }
        areapemsc.close();
}
}
