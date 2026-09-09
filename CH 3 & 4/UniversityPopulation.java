import java.util.Scanner;

public class UniversityPopulation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numStudents;

      numStudents = scnr.nextInt();

      if ((numStudents >= 11000) && (numStudents <= 20000)) {
         System.out.println("Mid-size university");
      }
      else {
         System.out.println("Not a mid-size university");
      }
   }
}