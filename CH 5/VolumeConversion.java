import java.util.Scanner;

public class VolumeConversion {

    public static double convertVolume (int cups, int fluidOunces) {
        double totalFluidOunces = (cups * 8) + fluidOunces;
        return totalFluidOunces * 0.0295735;
    }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int cups;
      int fluidOunces;
    
      cups = scan.nextInt();
      fluidOunces = scan.nextInt();
      
      // Print with value rounded to 3 decimal places  
      System.out.printf("The number of liters is %.3f\n", convertVolume(cups, fluidOunces));
   }
}