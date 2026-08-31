import java.util.Scanner;

public class SentenceFromStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String myName;
      String locationName;

      myName = scnr.next();
      locationName = scnr.next();

        System.out.println(myName + " has been to " + locationName + ".");

   }
}