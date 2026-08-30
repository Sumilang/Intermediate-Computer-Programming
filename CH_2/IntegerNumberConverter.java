import java.util.Scanner;

public class IntegerNumberConverter {
   public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in);
      double numMinutes;

      numMinutes = scnr.nextDouble();

      System.out.println((int) numMinutes);

   }
}