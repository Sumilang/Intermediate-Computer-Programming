package Lab8;

public class GradeUtility {
    public String getGrade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        } else if (marks >= 85) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
