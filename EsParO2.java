import java.util.Scanner;
public class EsParO2 {
    public static void main(String[] args){ 
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int numIng = numScanner.nextInt();
        System.out.println(numIng%2==0 ? "El numero es par" : "El numero es impar");
        numScanner.close();
    }
}
