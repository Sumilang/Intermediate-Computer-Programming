import java.util.Scanner;

public class MeasurementConverter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int totalOunces;
      int numPints;
      int numCups;
      int numOunces;

      totalOunces = scnr.nextInt();

      numPints = totalOunces / 16;
      numCups = totalOunces % 16 / 8;
      numOunces = totalOunces % 8;

      System.out.println("Pints: " + numPints);
      System.out.println("Cups: " + numCups);
      System.out.println("Ounces: " + numOunces);
   }
}