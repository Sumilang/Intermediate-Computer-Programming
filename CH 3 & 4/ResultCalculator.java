import java.util.Scanner;

public class ResultCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userIn;
      int outputVal;

      outputVal = 0;
      userIn = scnr.nextInt();

        while (userIn >= 0) {
        if (userIn % 3 == 0) {
            System.out.println("hit");
            outputVal++;
        } else {
            System.out.println("miss");
        }
        userIn = scnr.nextInt();
        }

      System.out.println("Output value is " + outputVal);
   }
}