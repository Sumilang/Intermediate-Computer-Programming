import java.util.Scanner;

public class ArrayModification {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] valsList;
      int numValues;
      int i;

      numValues = scnr.nextInt();

      valsList = new int[numValues];

        valsList[0] = scnr.nextInt();
    valsList[1] = scnr.nextInt();

    for (i = 2; i < valsList.length; ++i) {
        valsList[i] = valsList[i - 1] + valsList[i - 2];
    }

      System.out.print("Sequence: ");
      for (i = 0; i < valsList.length; ++i) {
         System.out.print(valsList[i] + " ");
      }
      System.out.println();
   }
}