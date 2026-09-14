import java.util.Scanner;

public class StringModification2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputString;

      inputString = scnr.nextLine();

    if (!Character.isWhitespace(inputString.charAt(0)) && 
        !Character.isWhitespace(inputString.charAt(1)) && 
        !Character.isWhitespace(inputString.charAt(2))) {
        System.out.println("Valid string");
    }
    else {
        System.out.println("Invalid string");
    }

   }
}