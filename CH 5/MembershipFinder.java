import java.util.Scanner;

public class MembershipFinder {

    public static String findMuseumMembership(int visits, int age) {
        String membership;
    
        if (visits <= 5) {
            if (age < 8) {
                membership = "80";
            } else if (age >= 8 && age <= 85) {
                membership = "85";
            } else {
                membership = "75";
            }
        } else if (visits >= 6 && visits <= 11) {
            if (age < 8) {
                membership = "45";
            } else if (age >= 8 && age <= 85) {
                membership = "50";
            } else {
                membership = "40";
            }
        } else {
            if (age < 8) {
                membership = "30";
            } else if (age >= 8 && age <= 85) {
                membership = "35";
            } else {
                membership = "25";
            }
        }    
    
        return membership;
    }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int visits;
      int age;

      visits = scnr.nextInt();
      age = scnr.nextInt();

      System.out.println(findMuseumMembership(visits, age));
   }
}