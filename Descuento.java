import java.util.Scanner;
public class Descuento {
    public static void main(String[] args) {
        Scanner descsc = new Scanner(System.in);
       int precio;
       String frase;
       frase = ("el precio final aplicando el descuento es de ");
       System.out.println("Ingrese el precio del producto ");
       precio = descsc.nextInt();
        if (precio >= 100) {
        System.out.println(frase +(precio -(precio*0.1)));
       } else if (precio <= 99 && precio > 0) {
       System.out.println("El valor del producto es " +precio);
    } else System.out.println("el precio es inválido");
    descsc.close();
}
}
