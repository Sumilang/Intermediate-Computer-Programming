import java.util.Scanner;

public class MultIfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int objectMass;

      objectMass = scnr.nextInt();

        if (objectMass == 0) {
             System.out.println("None");
        }
        else if (objectMass == 500) {
             System.out.println("Half of a kilogram");
        }
        else {
             System.out.println("Other mass");
        }

   }
}s