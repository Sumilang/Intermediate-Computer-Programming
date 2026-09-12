import java.util.Scanner;

public class StringLength {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
   
      userString = scnr.nextLine();

    if (userString.length() <= 4) {
        System.out.println("Meets requirements");
    }
    else {
        System.out.println("Not short enough");
    }

   }
}