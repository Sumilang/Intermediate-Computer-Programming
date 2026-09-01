import java.util.Scanner;

public class IfElse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int httpCode;

      httpCode = scnr.nextInt();

        if (httpCode == 401) {
             System.out.println("Unauthorized");
        }
        else {
             System.out.println("Authorized");
        }

   }
}