import java.util.Scanner;

public class AgeChecker {
	public static void printAge(int age) {
    if (age < 0 || age > 120) {
        age = -999;
    }

		System.out.println("Age: " + age + " year(s) old");
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int age;

		age = scnr.nextInt();
		printAge(age);
	}
}