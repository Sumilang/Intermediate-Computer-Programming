import java.util.Scanner;

public class ValuePrinter {

public static void outputVals(int startVal, int endVal) {
   for (int i = startVal; i <= endVal; ++i) {
      System.out.println(i);
   }
}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int number1;
		int number2;

		number1 = scnr.nextInt();
		number2 = scnr.nextInt();

		outputVals(number1, number2);
	}
}