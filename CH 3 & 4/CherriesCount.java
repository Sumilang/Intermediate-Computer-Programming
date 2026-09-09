import java.util.Scanner;

public class CherriesCount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int orderedCherries;
      
      orderedCherries = scnr.nextInt();

    if ((orderedCherries >= 50) && (orderedCherries <= 100)) {
        System.out.println("Large package");
    }
    else if((orderedCherries >= 160) && (orderedCherries <= 190)) {
        System.out.println("Extra large package");
    }
   }
}
