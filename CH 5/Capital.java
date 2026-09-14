import java.util.Scanner;

public class Capital {

    public static void printCapital(String capital, String region) {
        System.out.println(capital + " is " + region + "'s capital.");
    }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String capitalName;
      String regionName;

      capitalName = scnr.next();
      regionName = scnr.next();

      printCapital(capitalName, regionName);
   }
}