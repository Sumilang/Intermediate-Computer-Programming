import java.util.Scanner;

public class TaxRanges {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputPay;

      inputPay = scnr.nextInt();

      if ((inputPay >= 51000) && (inputPay <= 87000)) {
         System.out.println("24% tax bracket");
      }
      else {
         System.out.println("Different tax bracket");
      }
   }
}