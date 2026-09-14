import java.util.Scanner;

public class StringChecker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;

      userString = scnr.nextLine();

     if (Character.isLowerCase(userString.charAt(0))) {
         System.out.println("String accepted");
      }
      else {
         System.out.println("String not accepted");
        }

   }
}