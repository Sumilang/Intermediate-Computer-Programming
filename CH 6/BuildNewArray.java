import java.util.Scanner;

public class BuildNewArray {
   public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String inputLine;
		String[] newArray;
		int i;

		inputLine = scnr.nextLine();

      newArray = inputLine.split("=");

      for (i = 0; i < newArray.length; ++i) {
			System.out.println(newArray[i]);
      }
   }
}