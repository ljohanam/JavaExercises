import java.util.Scanner;

public class ArrayCopyAdd {
    public static void main(String[] args) {
        Scanner array3sc = new Scanner(System.in);
        int array3[] = { 1, 2, 3 };
        int array4[] = new int[5];
        array4[0] = array3[0];
        array4[1] = array3[1];
        array4[2] = array3[2];
        System.out.println("ingrese un elemento adicional para el array");
        array4[3] = array3sc.nextInt();
        System.out.println("ingrese un elemento adicional para el array");
        array4[4] = array3sc.nextInt();
        System.out.println("el array nuevo es: " + array4[0] + array4[1] + array4[2] + array4[3] + array4[4]);
        array3sc.close();

    }
}
