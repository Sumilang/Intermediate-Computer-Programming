import java.util.Scanner;

public class PrecedenceError {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int in1;
      int in2;
      int in3;

      in1 = scnr.nextInt();
      in2 = scnr.nextInt();
      in3 = scnr.nextInt();

      // Fix the precedence error in the following line
      if ((in1 % 3 == 0) && ((in2 % 5 == 0) || (in3 % 2 == 0))) {
         System.out.println("Input meets requirements.");
      }
      else {
         System.out.println("Input doesn't meet requirements.");
      }
   }
}