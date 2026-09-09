import java.util.Scanner;

public class NumberChecker {
   public static void main (String [] args) {
      int userNum;
      
      Scanner input = new Scanner(System.in);
      userNum = input.nextInt();    // Program will be tested with values: 0, 1, 2, 3.

      if (userNum == 2) {
         System.out.println("Num is equal to two");
      }
      else {
         System.out.println("Num is not two");
      }

   }
}