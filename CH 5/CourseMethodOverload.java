import java.util.Scanner;

public class CourseMethodOverload {
   public static void displayCourse(int grade, String courseName) {
      System.out.println(courseName + " grade: " + grade);
   }
   
   public static void displayCourse(int customGrade) {
      System.out.println("Calculus grade: " + customGrade);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int grade;
		String courseName;
      
      grade = scnr.nextInt();
		courseName = scnr.next();
      
      displayCourse(grade, courseName);
      displayCourse(92); // Overloaded method called
   }
}