import java.util.Scanner;

public class SleepHours {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int nappingHours1;
		int nappingHours2;
		int nappingHours3;
      int numStudents;
      double averageHours;

      nappingHours1 = scnr.nextInt();
		nappingHours2 = scnr.nextInt();
		nappingHours3 = scnr.nextInt();
      numStudents = scnr.nextInt();

        averageHours = (double)(nappingHours1 + nappingHours2 + nappingHours3) / numStudents;  

      System.out.printf("%.2f\n", averageHours);
   }
}