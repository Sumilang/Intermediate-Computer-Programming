import java.util.Scanner;

public class ModifyArray {

   /* Your code goes here */

   public static void printArr(int[] arr) {
      int i;

      for (i = 0; i < arr.length; ++i) {
         System.out.print(arr[i] + " ");
      }

      System.out.println();
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] myArray;
      int numVals;
      int i;

      numVals = scnr.nextInt();

      myArray = new int[numVals];

      for (i = 0; i < myArray.length; ++i) {
         myArray[i] = scnr.nextInt();
      }

      System.out.print("Initial array: ");
      printArr(myArray);

      subtractIndexFromElements(myArray);

      System.out.print("Final array: ");
      printArr(myArray);
   }
}