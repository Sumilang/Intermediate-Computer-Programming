import java.util.Scanner;

public class KilolitersConverter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int LITERS_PER_KILOLITER = 1000;
      int numLiters;
      double numKiloliters;

      numLiters = scnr.nextInt();

      numKiloliters = (double) numLiters / LITERS_PER_KILOLITER;

      System.out.printf("%.2f kiloliters\n", numKiloliters);
   }
}