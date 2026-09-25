import java.util.Scanner;

public class CashRecords {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements;
		int i;

		numElements = scnr.nextInt();

        int[] truckNumbers = new int[numElements];
        int[] serviceFees = new int[numElements];

        for (i = 0; i < numElements; ++i) {
            truckNumbers[i] = scnr.nextInt();
            serviceFees[i] = scnr.nextInt();
        }

      for (i = 0; i < truckNumbers.length; ++i) {
			System.out.println("Truck number: " + truckNumbers[i] + ", Fees: $" + serviceFees[i]);
		}
   }
}