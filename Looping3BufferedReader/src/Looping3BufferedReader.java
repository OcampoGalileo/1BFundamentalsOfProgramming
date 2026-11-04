import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Looping3BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double balance = 20000.00;

        System.out.println("Initial Account Balance: P" + String.format("%.2f", balance));
        System.out.println("Enter numbers (Positive = Deposit, Negative = Withdrawal, 0 = Exit): ");

        while (true) {
            System.out.print("\nEnter amount: ");
            double amount = Double.parseDouble(reader.readLine());

            if (amount == 0) {
                System.out.println("Program terminated. Final Balance: P" + String.format("%.2f", balance));
                break;
            }

            if (amount > 0) {
                balance += amount;
                System.out.println("Successfully deposited P" + String.format("%.2f", amount));
            } else {
                double withdrawalAmount = Math.abs(amount);
                if (withdrawalAmount > balance) {
                    System.out.println("INSUFFICIENT FUNDS!");
                } else {
                    balance -= withdrawalAmount;
                    System.out.println("Successfully Withdrew P" + String.format("%.2f", withdrawalAmount));
                }
            }
            System.out.println("Outstanding Balance: P" + String.format("%.2f", balance));
        }
    }
}