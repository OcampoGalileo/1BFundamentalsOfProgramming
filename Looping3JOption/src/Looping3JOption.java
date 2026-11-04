import javax.swing.JOptionPane;

public class Looping3JOption {
    public static void main(String[] args) {
        double balance = 20000.00;

        JOptionPane.showMessageDialog(null,
                "Initial Account Balance: P" + String.format("%.2f", balance) +
                        "\nEnter numbers (Positive = Deposit, Negative = Withdrawal, 0 = Exit).");

        while (true) {
            String input = JOptionPane.showInputDialog(null,
                    "Current Balance: P" + String.format("%.2f", balance) +
                            "\nEnter amount (or 0 to exit):");

            if (input == null) break; // Cancelled

            double amount;
            try {
                amount = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                continue;
            }

            if (amount == 0) {
                JOptionPane.showMessageDialog(null, "Program terminated. Final Balance: P" + String.format("%.2f", balance));
                break;
            }

            if (amount > 0) {
                balance += amount;
                JOptionPane.showMessageDialog(null,
                        "Successfully deposited P" + String.format("%.2f", amount) +
                                "\nOutstanding Balance: P" + String.format("%.2f", balance));
            } else {
                double withdrawalAmount = Math.abs(amount);
                if (withdrawalAmount > balance) {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    balance -= withdrawalAmount;
                    JOptionPane.showMessageDialog(null,
                            "Successfully withdrew P" + String.format("%.2f", withdrawalAmount) +
                                    "\nOutstanding Balance: P" + String.format("%.2f", balance));
                }
            }
        }
        System.exit(0);
    }
}