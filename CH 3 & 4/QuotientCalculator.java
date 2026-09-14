import java.util.Scanner;

public class QuotientCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double userNum;

		userNum = scnr.nextDouble();

      while (userNum > 1.0) {
            userNum = userNum / 9.0;
            System.out.printf("%.1f\n", userNum);
      }

   }
}