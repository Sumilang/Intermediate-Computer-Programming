import java.util.Scanner;

public class MathMethods3 {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double p;
      double q;
      double val;

      p = scnr.nextDouble();
      q = scnr.nextDouble();

      val = Math.abs(Math.pow(p, 4) + Math.pow(q, 3));

      System.out.printf("%.1f\n", val); // Outputs val with 1 decimal place
   }
}

