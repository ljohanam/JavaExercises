import java.util.Scanner;
public class LimSqrt {
    public static void main(String[] args) {
        Scanner limsqrtsc = new Scanner(System.in);
        System.out.println("Ingrese un límite superior");
        int limsup = limsqrtsc.nextInt();
        System.out.println("Ingrese el límite inferior");
        int liminf = limsqrtsc.nextInt();
        double randomnum = (int)(Math.random()*(limsup - liminf) + liminf);
        boolean esPrimo = randomnum % randomnum && randomnum == 0 ? true : false;//  esPrimo
        if (esPrimo == true) {
        System.out.println("El valor aleatorio generado es: " + randomnum + "y este es un numero primo");
        } else {System.out.println("El valor aleatorio generado es: " + randomnum + "y este es un numero primo");
                }
        limsqrtsc.close();
        }
}
