import java.util.Scanner;

public class PenSurvey {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int penCount;

      penCount = scnr.nextInt();

      if (penCount <= 12) {
        System.out.println("Too few pens");
      }
      else {
        System.out.println("An acceptable number of pens");
      }
   }
}