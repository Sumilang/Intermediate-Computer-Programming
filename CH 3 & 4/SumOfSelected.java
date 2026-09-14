import java.util.Scanner;

public class SumOfSelected {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputNumber;
      int sumOfSelected;

      sumOfSelected = 0;
      inputNumber = scnr.nextInt(); // The first integer is read

      while (inputNumber != -100) {
         if (inputNumber != 0) {
            System.out.println(inputNumber);
            sumOfSelected = sumOfSelected + inputNumber;
         }
         inputNumber = scnr.nextInt();
      }

      System.out.println("The sum of all non-zero values is " + sumOfSelected);
   }
}