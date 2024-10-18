import java.util.Scanner;
public class ArraySearchElem {
    public static void main(String[] args) {
    int[] array = {7,5,9};
System.out.println("ingrese un elemento para buscar en el array");
Scanner arraysc = new Scanner(System.in);
int elem = arraysc.nextInt();

if (elem == array[0] || elem == array[1] || elem == array[2]) {

    System.out.println("el número ingresado " + elem + " sí se encuentra en el array");

} else {
    System.out.println("el número ingresado " + elem + " no se encuentra en el array");
    
}

arraysc.close();
    }
}

