import java.util.Scanner;

public class OrangeCount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int orangesAvailable;
      
      orangesAvailable = scnr.nextInt();

    if ((orangesAvailable <= 15) || (orangesAvailable > 25)) {
        System.out.println("Unacceptable batch");
    }      

   }
}