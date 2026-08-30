import java.util.Scanner;

public class ValueFinder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;
      int onesDigit;

      userInput = scnr.nextInt();

      onesDigit = userInput % 10;

      System.out.println("Value in ones place: " + onesDigit);
   }
}