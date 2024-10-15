import java.util.Scanner;
public class CondicionalesA2 {
    public static void main(String[] args) {
    Scanner condA2sc = new Scanner(System.in);
       int punt;
       System.out.println("Ingrese su puntuación (de 1-100) ");
       punt = condA2sc.nextInt();
      if (punt >= 90 && punt <= 100) {
       System.out.println("su puntuación es A ");
      } else if (punt >= 80 && punt <= 89) {
      System.out.println("su puntuación es B ");
      } else if (punt >= 70 && punt <= 79) {
      System.out.println("su puntuación es C ");
      } else if (punt >= 60 && punt <= 69) {
      System.out.println("su puntuación es D ");
      } else if (punt >= 0 && punt <= 60) {
      System.out.println("su puntuación es F ");
      } else {System.out.println("puntuación no válida");
    }
    condA2sc.close();
    }
}

