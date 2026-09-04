import java.util.Scanner;

public class Relational {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;
      
      userInput = scnr.nextInt();      
      
      if (userInput > 0) {
         System.out.println("More than 0");       
      }
      else {
         System.out.println("0 or less");
      }
   }
}