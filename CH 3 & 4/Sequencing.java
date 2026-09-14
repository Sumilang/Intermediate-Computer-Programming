import java.util.Scanner;

public class Sequencing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentNum;
      int previousNum;
   
      previousNum = scnr.nextInt();
      currentNum = scnr.nextInt();
      System.out.println("Sequence starts at " + previousNum + ".");

      while (currentNum > previousNum) {
         System.out.println(currentNum + " is increasing");
         previousNum = currentNum;
         currentNum = scnr.nextInt();
      }

   }
}