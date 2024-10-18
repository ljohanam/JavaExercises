import java.util.Scanner;
public class LimSqrt {
    public static void main(String[] args) {
        Scanner limsqrtsc = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 30 "); 
        int limsup = limsqrtsc.nextInt();
        int liminf = 1;
        double randomnum = (int)(Math.random()*(limsup - liminf) + liminf);
        double randomsqrt = Math.sqrt(randomnum);
        System.out.println("la raiz cuadrada de " + randomnum + " es: " + randomsqrt);	
        int [] primos = {2,3,5,7,11,13,17,19,23,29};
        boolean esPrimo = false;
        for (int primo : primos) {
            if (randomnum == primo) {
                esPrimo = true;
                break;
            }
        }
        
        if (esPrimo) {
            System.out.println("El valor aleatorio generado " + randomnum + " es un número primo.");
        } else {
            System.out.println("El valor aleatorio generado " + randomnum + " no es un número primo.");
        }
        limsqrtsc.close();
        }
    }

