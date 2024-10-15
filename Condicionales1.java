import java.util.Scanner;
public class Condicionales1 {
    public static void main(String[] args) {
        Scanner condsc = new Scanner(System.in);
       int NumIng;
       System.out.println("Ingrese un número ");
       NumIng = condsc.nextInt();
        if (NumIng == 0) {
            System.out.println("cero ");
        }
        else if (NumIng > 0){
            System.out.println("positivo ");
        }
        else {
               System.out.println("Negativo ");
       }
       condsc.close();
}
}