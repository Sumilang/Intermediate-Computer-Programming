import java.util.Scanner;

public class NapkinsQuantity {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int requestedNapkins;
      
      requestedNapkins = scnr.nextInt();

    if ((requestedNapkins >= 25) && (requestedNapkins < 45)) {
        System.out.println("Basic box");
    }
    else if ((requestedNapkins >= 85) && (requestedNapkins <= 120)) {
        System.out.println("Standard box");
    }
    else {
        System.out.println("Select another amount");
    }

   }
}