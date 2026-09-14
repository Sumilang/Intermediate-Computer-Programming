import java.util.Scanner;

public class ValueReader {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char valueIn;

      valueIn = scnr.next().charAt(0);
      while (valueIn != 's') {
         System.out.println("User entered " + valueIn);
         valueIn = scnr.next().charAt(0);
      }

      System.out.println("Exit"); 
   }
}