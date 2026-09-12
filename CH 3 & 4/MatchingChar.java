import java.util.Scanner;

public class MatchingChar {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputStr;
		int strIndex;

    inputStr = scnr.nextLine();
	strIndex = scnr.nextInt();

    
      if (inputStr.charAt(strIndex) == 'w') {
         System.out.println("Found match");
      } else {
         System.out.println("No match");
      }

   }
}