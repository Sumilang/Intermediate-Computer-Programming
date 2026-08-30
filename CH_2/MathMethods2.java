import java.util.Scanner;

public class MathMethods2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double w;
      double x;
      double y;

      w = scnr.nextDouble();
      x = scnr.nextDouble();

      y = Math.sqrt(w + Math.pow(x, 5)); 

      System.out.printf("%.1f\n", y); // Outputs y with 1 decimal place
   }
}