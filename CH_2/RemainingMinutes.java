import java.util.Scanner;

public class RemainingMinutes {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int totalMinutes;
      int mileTimeJoy;
      int remainingMinutes;

      totalMinutes = scnr.nextInt();
      mileTimeJoy = scnr.nextInt();

      remainingMinutes = totalMinutes % mileTimeJoy;

      System.out.println("Remaining minutes: " + remainingMinutes);
   }
}