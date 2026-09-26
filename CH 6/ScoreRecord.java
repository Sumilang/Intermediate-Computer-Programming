import java.util.Scanner;

public class ScoreRecord {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ARR_VALS = 6;
      int[] dailyScores = new int[ARR_VALS];
      int i;

      for (i = 0; i < dailyScores.length; ++i) {
         dailyScores[i] = scnr.nextInt();
      }

      for (i = dailyScores.length - 1; i >= dailyScores.length / 2; --i) {
        System.out.print(dailyScores[i]);
        if (i > dailyScores.length / 2) {
            System.out.print(" | ");
        }
      }

      System.out.println();
   }
}