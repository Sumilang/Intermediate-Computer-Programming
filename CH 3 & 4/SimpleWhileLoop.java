import java.util.Scanner;

public class SimpleWhileLoop {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputWord;

      inputWord = scnr.next();

      while (!inputWord.equals("rabbits")) {
         System.out.println("rabbits not found yet");
         inputWord = scnr.next();
      }

      System.out.println("Got rabbits!");
   }
}