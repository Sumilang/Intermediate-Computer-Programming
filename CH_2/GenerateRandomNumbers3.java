import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers3 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;
		int remainingKeychains;
		int lowBound;
		int upBound;
		int bin1;
		int bin2;

        seedVal = scnr.nextInt();
		lowBound = scnr.nextInt();
		upBound = scnr.nextInt();
		
		System.out.println("Initial: 80");

		randGen.setSeed(seedVal);
		bin1 = randGen.nextInt(upBound - lowBound + 1) + lowBound;
		bin2 = randGen.nextInt(upBound - lowBound + 1) + lowBound;
		remainingKeychains = 80 - bin1 - bin2;

		System.out.println(bin1);
		System.out.println(bin2);
		System.out.println("Remainder: " + remainingKeychains);
   }
}