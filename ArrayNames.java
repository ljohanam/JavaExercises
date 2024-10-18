import java.util.Scanner;

public class ArrayNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ArrayNames = new String[4];
        System.out.println("Ingresa un primer nombre: ");
        String name1 = sc.nextLine();
        System.out.println("Ingresa un segundo nombre: ");
        String name2 = sc.nextLine();
        System.out.println("Ingresa un tercer nombre: ");
        String name3 = sc.nextLine();
        System.out.println("Ingresa un cuarto nombre: ");
        String name4 = sc.nextLine();

       // Insertar y comparar los nombres en el array
        // Ordenar el primer y segundo nombre
        if (name2.compareTo(name1) < 0) {
            ArrayNames[0] = name2;
            ArrayNames[1] = name1;
        } else {
            ArrayNames[0] = name1;
            ArrayNames[1] = name2;
        }
        
        // Insertar el tercer nombre en el lugar correcto
        if (name3.compareTo(ArrayNames[0]) < 0) {
            ArrayNames[2] = ArrayNames[1];
            ArrayNames[1] = ArrayNames[0];
            ArrayNames[0] = name3;
        } else if (name3.compareTo(ArrayNames[1]) < 0) {
            ArrayNames[2] = ArrayNames[1];
            ArrayNames[1] = name3;
        } else {
            ArrayNames[2] = name3;
        }
        
        // Insertar el cuarto nombre en el lugar correcto
        if (name4.compareTo(ArrayNames[0]) < 0) {
            ArrayNames[3] = ArrayNames[2];
            ArrayNames[2] = ArrayNames[1];
            ArrayNames[1] = ArrayNames[0];
            ArrayNames[0] = name4;
        } else if (name4.compareTo(ArrayNames[1]) < 0) {
            ArrayNames[3] = ArrayNames[2];
            ArrayNames[2] = ArrayNames[1];
            ArrayNames[1] = name4;
        } else if (name4.compareTo(ArrayNames[2]) < 0) {
            ArrayNames[3] = ArrayNames[2];
            ArrayNames[2] = name4;
        } else {
            ArrayNames[3] = name4;
        }

        // Imprimir el array ordenado
        System.out.println(" El array con Los nombres ordenados alfabéticamente es " + ArrayNames[0] + ", " + ArrayNames[1] + ", " + ArrayNames[2] + ", " + ArrayNames[3]);
        
        sc.close();
    }
}
