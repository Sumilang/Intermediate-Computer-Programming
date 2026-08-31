package week3;

public class ContinueDemo {
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // skip the rest of the loop body for even numbers
            }
            System.out.println("Odd number: " + i);
        }
        System.out.println("Done");
    }

}
