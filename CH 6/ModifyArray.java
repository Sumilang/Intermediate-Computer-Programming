import java.util.Scanner;

public class ModifyArray {

   public static void arrayPositionSwap(int[] arr) {
   int temp = arr[0];
   arr[0] = arr[1];
   arr[1] = temp;
}

   public static void printArr(int[] arr) {
      int i;

      for (i = 0; i < arr.length; ++i) {
         System.out.print(arr[i] + " ");
      }

      System.out.println();
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 6;
		int[] scoreArray = new int[NUM_ELEMENTS];
      int i;

      for (i = 0; i < scoreArray.length; ++i) {
         scoreArray[i] = scnr.nextInt();
      }

      System.out.print("Old array: ");
      printArr(scoreArray);

      arrayPositionSwap(scoreArray);

      System.out.print("New array: ");
      printArr(scoreArray);
   }
}