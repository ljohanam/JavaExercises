import java.util.Scanner;

public class ArraySumPosPar {
    public static void main(String[] args) {
        System.out.println("Ingrese un número para el límite sup del array");
        Scanner arraysc = new Scanner(System.in);
        int limsup = arraysc.nextInt();
        System.out.println("Ingrese un número para el límite inf del array");
        int liminf = arraysc.nextInt();
        int[] array = new int[5];
        array[0] = (int) (Math.random() * (limsup - liminf + 1) + liminf);
        array[1] = (int) (Math.random() * (limsup - liminf + 1) + liminf);
        array[2] = (int) (Math.random() * (limsup - liminf + 1) + liminf);
        array[3] = (int) (Math.random() * (limsup - liminf + 1) + liminf);
        array[4] = (int) (Math.random() * (limsup - liminf + 1) + liminf);

        int suma = array[0] + array[2] + array[4];
        System.out.println("la suma del array en las posiciones pares es: " + array[0] + " " + array[1] + " " +array[2] + " " + array[3] + " " +array[4]  + " es: " + suma);
        arraysc.close();
    }

}
