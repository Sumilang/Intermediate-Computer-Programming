import java.util.Scanner;

public class BudgetAnalysis {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userSalary;
      int companyBudget;

      userSalary = scnr.nextInt();
      companyBudget = scnr.nextInt();

      if (userSalary <= 150000) {
        companyBudget = companyBudget - 150000;
      }

      System.out.println(companyBudget);
   }
}