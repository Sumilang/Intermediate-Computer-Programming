package Lab.Lab5;

import java.util.Scanner;

class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "Minimum balance of 5000 must be maintained.";
    }
}

public class BankAccount {
    static int balance = 10000;

    static void withdraw(int amount) throws LowBalanceException {
        if (balance - amount < 5000) {
            throw new LowBalanceException();
            
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current balance: " + balance);
        System.out.print("Enter withdrawal amount: ");
        int amount = scanner.nextInt();

        try {
            withdraw(amount);

        } catch (LowBalanceException e) {
            System.out.println(e);

        } finally {
            System.out.println("Banking operation finished.");
        }

        System.out.println("Transaction completed");
        scanner.close();
    }
}