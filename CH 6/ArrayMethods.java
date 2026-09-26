import java.util.Scanner;

public class ArrayMethods {

   public static void filterArray(int[] arr, int numCompare) {
   for (int i = 0; i < arr.length; ++i) {
      if (arr[i] < numCompare) {
         arr[i] = 1;
      } else {
         arr[i] = 0;
      }
   }
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
      int[] arrToModify;
      int numVals;
      int numCompare;
      int i;

      numVals = scnr.nextInt();

      arrToModify = new int[numVals];

      for (i = 0; i < arrToModify.length; ++i) {
         arrToModify[i] = scnr.nextInt();
      }

      numCompare = scnr.nextInt();

      System.out.print("Old array: ");
      printArr(arrToModify);

      filterArray(arrToModify, numCompare);

      System.out.print("New array: ");
      printArr(arrToModify);
   }
}