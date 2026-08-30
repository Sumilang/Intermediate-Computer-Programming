import java.util.Scanner;

public class MathMethods {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double b;
      double c;
      double val;

      b = scnr.nextDouble();
      c = scnr.nextDouble();

      val = Math.pow(b, c);

      System.out.printf("%.2f\n", val); // Outputs val with 2 decimal places
   }
}