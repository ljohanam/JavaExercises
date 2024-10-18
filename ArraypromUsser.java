import java.util.Scanner;

public class ArraypromUsser {
    public static void main(String[] args) {
        Scanner arraysc = new Scanner(System.in);
        int[] array2 = new int[4];
        System.out.println("Ingrese el primer entero del array");
        array2[0] = arraysc.nextInt();
        System.out.println("Ingrese el segundo entero del array");
        array2[1] = arraysc.nextInt();
        System.out.println("Ingrese el tercero entero del array");
        array2[2] = arraysc.nextInt();
        System.out.println("Ingrese el cuarto entero del array");
        array2[3] = arraysc.nextInt();
        double prom = (array2[0] + array2[1] + array2[2] + array2[3]) / 4;
        // (elem1 + elem2 + elem3 + elem4) / 4;
        System.out.println("El promedio del array es: " + prom);
        arraysc.close();
    }
}
