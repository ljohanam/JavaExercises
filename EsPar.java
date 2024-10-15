import java.util.Scanner;
public class EsPar {
    public static void main(String[] args){ 
        int numIng;
        int esPar;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        numIng = numScanner.nextInt();
        esPar = numIng % 2;
        if(esPar == 0){
            System.out.println("Tu número es par");
        }else{
            System.out.println("Tu numero es impar");
        }
        numScanner.close();
    }
}
// System.out.println(num%2==0 ? "El numero es par" : "El numero es impar");