import java.util.Scanner;

public class StudentCourse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String studentName;
      String courseName;

        studentName = scnr.nextLine();
        courseName = scnr.next();

      System.out.println(studentName + " is studying " + courseName + ".");
   }
}