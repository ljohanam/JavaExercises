import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner cond2sc = new Scanner(System.in);
       int num;
       System.out.println("Ingrese un número ");
       num = cond2sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
        System.out.println("Su número es divisible por 5 y por 3 ");
        } else if (num % 3 == 0){
            System.out.println("Su número es divisible entre 3 ");
        } else if (num % 5 == 0) {
            System.out.println("es divisible entre 5 ");
        } else {System.out.println("sú numero no es divisible ni por 3 ni por 5");
    }
    cond2sc.close();
}
}

