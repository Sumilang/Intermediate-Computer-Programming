import java.util.Scanner;

public class ExtraCredit {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ARR_VALS = 9;
      int[] dailyMiles = new int[ARR_VALS];
      int i;
      int sumBonus;

      for (i = 0; i < dailyMiles.length; ++i) {
         dailyMiles[i] = scnr.nextInt();
      }

        sumBonus = 0;
            for (i = 0; i < dailyMiles.length; ++i) {
            if (dailyMiles[i] > 200) {
                sumBonus += (dailyMiles[i] - 200);
            }
        }

      System.out.println("Bonus sum: " + sumBonus);
   }
}