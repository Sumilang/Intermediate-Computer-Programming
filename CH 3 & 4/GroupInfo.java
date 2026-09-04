import java.util.Scanner;

public class GroupInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int pieceCount;
      int acceptedGroups;
      int invalidGroups;

      pieceCount = scnr.nextInt();
      acceptedGroups = scnr.nextInt();
      invalidGroups = scnr.nextInt();

      if (pieceCount >= 17) {
        acceptedGroups = acceptedGroups - 2;
      }
      else {
        invalidGroups = invalidGroups - 4;
      }

      System.out.println(acceptedGroups);
      System.out.println(invalidGroups);
   }
}