import java.util.Scanner;

public class AppendString {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputString;
		String toAdd;
		String resultStr;

		inputString = scnr.nextLine();
		toAdd = scnr.nextLine();

        resultStr = inputString + " " + toAdd;

      System.out.println(resultStr);
   }
}