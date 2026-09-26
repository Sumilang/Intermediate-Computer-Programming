import java.util.Scanner;

public class DeskSupplies {
   public static String[] supplyDetails(String[] oldData) {

      String[] result = new String[oldData.length];
int i;

for (i = 0; i < oldData.length; ++i) {
    result[i] = oldData[i] + " needs to be replaced";
}

return result;

   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] currentInventory = new String[4];
      String[] arr;
      int i;

      for (i = 0; i < currentInventory.length; ++i) {
         currentInventory[i] = scnr.next();
      }

      arr = supplyDetails(currentInventory);

      for (i = 0; i < arr.length; ++i) {
         System.out.print(arr[i] + "\n");
      }

      // Check if the array returned by supplyDetails() is a copy of currentInventory
      if (arr == currentInventory) {
         System.out.println("\nA new array was not returned.");
      }
   }
}