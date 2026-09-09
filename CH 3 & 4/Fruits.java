import java.util.Scanner;

public class Fruits {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numCoconuts;
      int numKiwis;

      numCoconuts = scnr.nextInt();
      numKiwis = scnr.nextInt();

      if ((numCoconuts >= 27 || numKiwis >= 27) && numCoconuts + numKiwis <= 67) {
        System.out.println("Fruits meet requirements.");
      }
      else {
         System.out.println("Fruits do not meet requirements.");
      }
   }
}