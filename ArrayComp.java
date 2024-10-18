import java.util.Scanner;

public class ArrayComp {
    public static void main(String[] args) {
        System.out.println("Ingrese un número para el límite sup del array");
        Scanner arraysc = new Scanner(System.in);
        int limsup = arraysc.nextInt();
        System.out.println("Ingrese un número para el límite inf del array");
        int liminf = arraysc.nextInt();
        int[] array = new int[6];
        array[0] = (int) (Math.random() * (limsup - liminf + 1) + liminf);
        array[1] = (int) (Math.random() * (limsup - liminf + 1) + liminf);
        array[2] = (int) (Math.random() * (limsup - liminf + 1) + liminf);
        array[3] = (int) (Math.random() * (limsup - liminf + 1) + liminf);
        array[4] = (int) (Math.random() * (limsup - liminf + 1) + liminf);
        array[5] = (int) (Math.random() * (limsup - liminf + 1) + liminf);

        int par = 0;
        if (array[0] % 2 == 0) {
            par = par + 1;
        }
        if (array[1] % 2 == 0) {
            par = par + 1;
        }
        if (array[2] % 2 == 0) {
            par = par + 1;
        }
        if (array[3] % 2 == 0) {
            par = par + 1;
        }
        if (array[4] % 2 == 0) {
            par = par + 1;
        }
        if (array[5] % 2 == 0) {
            par = par + 1;
        }
        System.out.println("el array " + array[0] + " " + array[1] + " " +array[2] + " " + array[3] + " " +array[4] + " " +array[5] + " tiene " + par + " números pares");    
        arraysc.close();
    }
}
