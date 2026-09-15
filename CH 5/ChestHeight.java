import java.util.Scanner;

public class ChestHeight {
   public static void printChestHeight(double chestHeight) {
      System.out.printf("Chest height to two decimal places: %.2f centimeters\n", chestHeight);
   }

    public static void printChestHeight(int chestHeight) {
        System.out.printf("Chest height as a whole number: %d centimeters\n", chestHeight);
    }  

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double chestHeight1;
      int chestHeight2;
      
      chestHeight1 = scnr.nextDouble();
      chestHeight2 = scnr.nextInt();
      
      printChestHeight(chestHeight1);
      printChestHeight(chestHeight2);
   }
}