import java.util.Scanner;

public class CombineArrays {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 5;
      int[] unitCosts = new int[NUM_VALS];
      int[] quantityBought = new int[NUM_VALS];
      int i; 

      for (i = 0; i < unitCosts.length; ++i) {
         unitCosts[i] = scnr.nextInt();
      }

      for (i = 0; i < quantityBought.length; ++i) {
         quantityBought[i] = scnr.nextInt();
      }

      for (i = 0; i < quantityBought.length; ++i) {
    if (quantityBought[i] % 2 == 0) {
        System.out.print(unitCosts[i] + " ");
    }
}
System.out.println();

   }
}