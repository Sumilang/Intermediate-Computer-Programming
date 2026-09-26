import java.util.Scanner;

public class ArrayUpdate {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] numbersList;
      int numValues;
      int i;

      numValues = scnr.nextInt();

      numbersList = new int[numValues];

      System.out.print("Original numbers: ");
      for (i = 0; i < numbersList.length; ++i) {
         numbersList[i] = scnr.nextInt();
         System.out.print(numbersList[i] + " ");
      }
      System.out.println();

      for (i = 0; i < numbersList.length; ++i) {
    if (numbersList[i] % 2 == 0) {
        System.out.println(numbersList[i] + " is corrected to an odd number");
        numbersList[i] = numbersList[i] - 1;
    }
}

      System.out.print("New numbers: ");
      for (i = 0; i < numbersList.length; ++i) {
         System.out.print(numbersList[i] + " ");
      }
      System.out.println();
   }
}