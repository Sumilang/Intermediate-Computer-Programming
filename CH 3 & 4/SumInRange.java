import java.util.Scanner;

public class SumInRange {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      double inputData;
      double sumInRange;

      sumInRange = 0.0;
      inputData = scnr.nextDouble(); // The first floating-point number is read

      while (inputData > -5.0 && inputData < 35.0) {
         sumInRange = sumInRange + inputData;
         inputData = scnr.nextDouble();
      }

      System.out.println(sumInRange);
   }
}