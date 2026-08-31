package week3;

public class BreakDemo {
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Checking number: " + i);

            if (i == 5) {                // condition to stop early
                System.out.println("Found 5 – breaking out of the loop!");
                break;                   // exits the for-loop immediately
            }
        }

        System.out.println("Loop ended.");
    }

}
