import java.util.Scanner;

public class Result {

   public static void printResult(int a, int b) {
    System.out.println("Result: " + (a * b));
   }

   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     int a;
     int b;

     a = scnr.nextInt();
     b = scnr.nextInt();

     printResult(a, b);
	}
}