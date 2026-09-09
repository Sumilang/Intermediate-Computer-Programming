import java.util.Scanner;

public class NumberComparisons {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputNum1;
      int inputNum2;
 
      inputNum1 = scnr.nextInt();
      inputNum2 = scnr.nextInt();

    if (inputNum1 > 25) {
        System.out.println("inputNum1 is greater than 25.");
    }
    if (inputNum2 <= 40){
        inputNum2 = 4;
    }
    else {
        System.out.println("inputNum2 is greater than 40.");
    }
   }
}