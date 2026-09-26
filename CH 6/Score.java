import java.util.Scanner;

public class Score {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double[] scoresList;
      double[] halfList;
      int numElements;
      int i;

      numElements = scnr.nextInt();

      scoresList = new double[numElements];

      for (i = 0; i < scoresList.length; ++i) {
         scoresList[i] = scnr.nextDouble();
      }

            halfList = new double[scoresList.length / 2];

        for (i = 0; i < halfList.length; ++i) {
            if (scoresList[i] > 70.0) {
                halfList[i] = scoresList[i];
            } else {
                halfList[i] = 0.0;
            }
}

      System.out.print("Original scores: ");
      for (i = 0; i < scoresList.length; ++i) {
         System.out.printf("%.1f ", scoresList[i]);
      }
      System.out.println();

      System.out.print("Updated first half: ");      
      for (i = 0; i < halfList.length; ++i) {
         System.out.printf("%.1f ", halfList[i]);
      }
      System.out.println();
   }
}