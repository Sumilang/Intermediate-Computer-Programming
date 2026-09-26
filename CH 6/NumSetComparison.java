import java.util.Scanner;

public class NumSetComparison {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int[] firstNumSet = new int[NUM_VALS];
      int[] secondNumSet = new int[NUM_VALS];
      int i;

      for (i = 0; i < firstNumSet.length; ++i) {
         firstNumSet[i] = scnr.nextInt();
      }

      for (i = 0; i < secondNumSet.length; ++i) {
         secondNumSet[i] = scnr.nextInt();
      }

      for (i = 0; i < NUM_VALS; ++i) {
    if (firstNumSet[i] <= secondNumSet[i]) {
        firstNumSet[i] = 0;
    } else {
        firstNumSet[i] -= 4;
    }
}

      for (i = 0; i < firstNumSet.length; ++i) {
         System.out.print(firstNumSet[i] + " ");
      }
      System.out.println();
   }
}