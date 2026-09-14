import java.util.Scanner;

public class NumberComputation {
   
public static int computeNum(int val) {
      return val + 9;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numRead;
      int result;
      
      numRead = scnr.nextInt();
      
      result = computeNum(numRead);
      
      System.out.println(result);
   }
}