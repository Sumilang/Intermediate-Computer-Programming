import java.util.Scanner;

public class MultIfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numberOfSides;

      numberOfSides = scnr.nextInt();

        if (numberOfSides == 5) {
             System.out.println("Pentagon");
        }
        else if (numberOfSides == 6) {
             System.out.println("Hexagon");
        }
        else if (numberOfSides == 8) {
             System.out.println("Octagon");
        }
        else {
             System.out.println("Another kind of polygon");
        }

   }
}