import java.util.Scanner;
public class RandomUsser {
    public static void main(String[] args) {
        Scanner randomlimsc = new Scanner(System.in);
        System.out.println("Ingresa un límite superior para el aleatorio");
        int limsup = randomlimsc.nextInt();
        System.out.println("Ingresa un límite inferior para el aleatorio");
        int liminf = randomlimsc.nextInt();
        System.out.println("El valor aleatorio es: " + (int)(Math.random()*(limsup - liminf) + liminf));
        randomlimsc.close();
    }
}
