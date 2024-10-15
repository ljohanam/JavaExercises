import java.util.Scanner;
public class scanneractividad {
    public static void main(String[] args){
        String nombre;
        Scanner myfirstscanncd = new Scanner(System.in);
        System.out.println("Cual es tu nombre? ");
        nombre = myfirstscanncd.nextLine();
        System.out.println("Hola " + nombre);
        myfirstscanncd.close();
}
}
