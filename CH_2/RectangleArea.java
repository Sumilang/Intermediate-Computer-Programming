import java.util.Scanner;

public class RectangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double rectangleArea;
      double rectangleLength;
      double rectangleWidth;
      
      rectangleLength = scnr.nextDouble();
      rectangleWidth = scnr.nextDouble();
      
      rectangleArea = rectangleLength * rectangleWidth;

      System.out.printf("Rectangle area is %.4f\n", rectangleArea);
   
   }
}