import java.util.Scanner;

public class ForksCount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numForks;
      
      numForks = scnr.nextInt();

    if ((numForks >= 35) && (numForks <= 65)) {
        System.out.println("Basic case");
    }
    else if ((numForks > 100) && (numForks <= 130)) {
        System.out.println("Standard case");
    }
    else {
        System.out.println("Not efficient to ship");
    }
   }
}