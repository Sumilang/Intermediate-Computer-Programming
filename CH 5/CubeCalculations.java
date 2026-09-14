import java.util.Scanner;

public class CubeCalculations {

   public static double calculateBaseArea(double cubeSideLength) {
      return cubeSideLength * cubeSideLength;
   }

    public static double calculateVol(double cubeSideLength) {
        return cubeSideLength * cubeSideLength * cubeSideLength;
    }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double cubeSideLength;
      
      cubeSideLength = scan.nextDouble();
      
      System.out.println("Cube side length: " + cubeSideLength);
      System.out.printf("Base area: %.1f\n", calculateBaseArea(cubeSideLength));
      System.out.printf("Volume: ");
      System.out.printf("%.1f\n", calculateVol(cubeSideLength));
   }
}