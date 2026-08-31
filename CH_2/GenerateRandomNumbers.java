import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int seedVal;
		int maxValue;
		int rollValue1;
		int rollValue2;
		int rollValue3;
		int rollValue4;

      seedVal = scnr.nextInt();
		maxValue = scnr.nextInt();

      randGen.setSeed(seedVal);

        rollValue1 = randGen.nextInt(maxValue) + 1;
		rollValue2 = randGen.nextInt(maxValue) + 1;
		rollValue3 = randGen.nextInt(maxValue) + 1;
		rollValue4 = randGen.nextInt(maxValue) + 1;

		System.out.println(rollValue1);
		System.out.println(rollValue2);
		System.out.println(rollValue3);
		System.out.println(rollValue4);
   }
}