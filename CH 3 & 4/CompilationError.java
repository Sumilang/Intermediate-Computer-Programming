import java.util.Scanner;

public class CompilationError {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int ageInput;

      ageInput = scnr.nextInt();

      // Fix the compilation error in the following line
      if (13 <= ageInput && ageInput < 20) {
         System.out.println("User is a teenager.");
      }
      else {
         System.out.println("User is not a teenager.");
      }
   }
}