import java.util.Scanner;

public class Office {
   public static String[] removeFromOffice(String[] supplies, int numShrink) {
      int i;

      String[] copyArray = new String[supplies.length - numShrink];

      for (i = 0; i < copyArray.length; ++i) {
         copyArray[i] = supplies[i];
      }

      return copyArray;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] helpfulSupplies = new String[3];
      int input;
      int i;

      for (i = 0; i < helpfulSupplies.length; ++i) {
         helpfulSupplies[i] = scnr.next();
      }
        
      // Read number of values to decrease array size by
      input = scnr.nextInt();

      helpfulSupplies = removeFromOffice(helpfulSupplies, input);

      for (i = 0; i < helpfulSupplies.length; ++i) {
         System.out.print(helpfulSupplies[i] + " ");
      }
   }
}