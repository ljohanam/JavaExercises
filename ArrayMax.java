import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner arraysc = new Scanner(System.in);
        int[] array2 = new int[5];

        System.out.println("Ingrese el primer entero del array");
        array2[0] = arraysc.nextInt();
        System.out.println("Ingrese el segundo entero del array");
        array2[1] = arraysc.nextInt();
        System.out.println("Ingrese el tercero entero del array");
        array2[2] = arraysc.nextInt();
        System.out.println("Ingrese el cuarto entero del array");
        array2[3] = arraysc.nextInt();
        System.out.println("Ingrese el cuarto entero del array");
        array2[4] = arraysc.nextInt();

        int max = array2[0];
        if (array2[1] > max) {
            max = array2[1];
        }
        if (array2[2] > max) {
            max = array2[2];
        }
        if (array2[3] > max) {
            max = array2[3];
        }
        if (array2[4] > max) {
            max = array2[4];
        }
    System.out.println("El maximo del array " + array2[0] + array2[1] + array2[2] + array2[3] + array2[4] + " es: " + max);
        arraysc.close();
    }
}
