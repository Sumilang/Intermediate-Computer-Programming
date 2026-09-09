import java.util.Scanner;

public class SafetyFeatures {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int yearMade;
 
      yearMade = scnr.nextInt();

    if (yearMade > 1949) {
        System.out.println("Probably can carry several people.");
    }
    if (yearMade < 1967) {
        System.out.println("Probably only has a few safety features.");
    }
    else if (yearMade > 1991) {
        System.out.println("Probably has traction control.");
    }

   }
}