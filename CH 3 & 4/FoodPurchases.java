import java.util.Scanner;

public class FoodPurchases {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numCoconuts;
      int myAllowance;
      int totalCost;
 
      numCoconuts = scnr.nextInt();
      myAllowance = scnr.nextInt();

      if (numCoconuts < 6) {
         System.out.println("Not allowed to purchase less than 6 coconuts");
      }
      else {
         totalCost = numCoconuts * 3;

         if (totalCost <= myAllowance) {
            System.out.println("Successful purchase");
         }
         else {
            System.out.println("Not enough money to buy all");
         }
      }
   }
}