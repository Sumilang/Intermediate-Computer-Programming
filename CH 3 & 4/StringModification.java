import java.util.Scanner;

public class StringModification {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inString;

      inString = scnr.nextLine();

    if (!Character.isLetter(inString.charAt(1))) {
    System.out.println("The second character is not alphabetic.");
    } 
    else {
    System.out.println("The second character is alphabetic: " + inString.charAt(1));
    }
   }
}