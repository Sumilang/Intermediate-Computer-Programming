import java.util.Scanner;

public class MilligramsToGrams {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double weightMg;
      double weightGrams;
   
      weightMg = scnr.nextDouble();
   
      weightGrams = weightMg / 1000;
      
      System.out.printf("1000 milligrams = 1 gram\n");
      System.out.printf("%.1f", weightMg);
      System.out.printf(" milligrams = %.5f\n", weightGrams);

   }
}