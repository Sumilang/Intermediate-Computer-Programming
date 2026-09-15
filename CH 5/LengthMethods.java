import java.util.Scanner;

public class LengthMethods {
   public static int convertLength(int meters) {
      return meters * 100;
   }

    public static int convertLength(int meters, int centimeters) {
        return (meters * 100) + centimeters;
    }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int metersUsed;
      int centimetersUsed;
      int totalCentimeters1;
      int totalCentimeters2;
      
      metersUsed = scnr.nextInt();
      centimetersUsed = scnr.nextInt();
      
      totalCentimeters1 = convertLength(metersUsed);
      System.out.println(metersUsed + " meters yields " + totalCentimeters1 + " centimeters.");
      
      totalCentimeters2 = convertLength(metersUsed, centimetersUsed);
      System.out.print(metersUsed + " meters and " + centimetersUsed + " centimeters yields ");
      System.out.println(totalCentimeters2 + " centimeters.");
   }
}