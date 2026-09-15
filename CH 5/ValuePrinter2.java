import java.util.Scanner;

public class ValuePrinter2 {

    public static void printResult(int num1, int num2) {
    int sum = 0;
    for (int i = num1; i <= num2; ++i) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    System.out.println(sum);
    }

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int number1;
		int number2;

		number1 = scnr.nextInt();
		number2 = scnr.nextInt();

		printResult(number1, number2);
	}
}