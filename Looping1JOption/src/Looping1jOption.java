import javax.swing.JOptionPane;

public class Looping1jOption {
    public static void main(String[] args) {
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter number " + i + " of 10:");
            if (input == null) return;

            int num = Integer.parseInt(input);

            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest + "\nLowest number: " + lowest,
                "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}