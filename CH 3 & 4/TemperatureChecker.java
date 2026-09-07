import java.util.Scanner;

public class TemperatureChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int tempInput;

      tempInput = scnr.nextInt();

      if (tempInput < 451) {
         System.out.println("New state: solid");
      }
      else if (tempInput >= 451 && tempInput <= 4533) {
         System.out.println("New state: liquid");
      }
      else {
         System.out.println("New state: gas");
      }

   }
}