import java.util.Scanner;

public class Relational {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inVal;
   
      inVal = scnr.nextInt(); 
   
      if (inVal > 77) {
         System.out.println("More than 77");
      }
      else {
         System.out.println("77 or less");
      }

   }
}