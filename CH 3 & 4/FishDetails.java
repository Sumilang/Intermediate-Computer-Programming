import java.util.Scanner;

public class FishDetails {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int fishCount;
   
    fishCount = scnr.nextInt();

    if (fishCount >= 13) {
        System.out.println("Multiple aquarium needed");
    }
    else if (fishCount < 13 && fishCount >= 7) {
        System.out.println("Mid-sized aquarium");
    }
    else if (fishCount < 7 && fishCount >= 1) {
        System.out.println("Small aquarium");
    }
    else {
        System.out.println("Invalid input");
    }

   }
}