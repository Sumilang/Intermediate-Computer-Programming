import java.util.Scanner;

public class CenturiesRanges {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int yearInput;

      yearInput = scnr.nextInt();

        if ((yearInput >= 601) && (yearInput <= 700)) {
             System.out.println("The 7th century");
        }
        else if ((yearInput >= 701) && (yearInput <= 800)) {
             System.out.println("The 8th century");
        }
        else if ((yearInput >= 801) && (yearInput <= 900)) {
             System.out.println("The 9th century");
        }
        else {
             System.out.println("Not in the period of research");
        }

   }
}