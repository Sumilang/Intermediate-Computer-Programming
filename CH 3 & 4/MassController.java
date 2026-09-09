import java.util.Scanner;

public class MassController {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double massInKilograms;
      
      massInKilograms = scnr.nextDouble();

    if ((massInKilograms < 35.5) || (massInKilograms > 60.5)){
        System.out.println("Dismiss");
    }   
    else {
        System.out.println("Allow");
    }
   }
}