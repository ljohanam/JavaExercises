import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner menusc = new Scanner(System.in);
        int option;
        System.out.println("\n Seleccióne una opción \n Opción 1: Guardar, \n Opción 2: cargar \n Opción 3. salir");
        option = menusc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Guardando");
                    break;
            case 2:
                System.out.println("Cargando");
                break;
            case 3:
                System.out.println("Saliendo del sistema");
                break;
            default:
                break;
}
menusc.close();
    }
}
