import java.util.Scanner;

public class Tool {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int toolCount;
   
      toolCount = scnr.nextInt();

    if (toolCount <= 14) {
        System.out.println("Personal tool box");
    }
    else if (toolCount <= 39) {
        System.out.println("Mid-sized tool box");
    }
    else {
        System.out.println("Need wall storage");
    }

   }
}