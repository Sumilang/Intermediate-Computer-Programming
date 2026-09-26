import java.util.Scanner;

public class ScoreData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ARR_LENGTH = 3;
      int[] hourlyScores = new int[ARR_LENGTH];
      int i;

      for (i = hourlyScores.length - 1; i >= 0; --i) {
        hourlyScores[i] = scnr.nextInt();
      }

      for (i = 0; i < hourlyScores.length; ++i) {
         System.out.print(hourlyScores[i] + " ");
      }

      System.out.println();
   }
}