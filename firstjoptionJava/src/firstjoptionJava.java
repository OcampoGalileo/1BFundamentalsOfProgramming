import javax.swing.JOptionPane;

public class firstjoptionJava {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a year:");

        if (input != null && !input.trim().isEmpty()) {
            try {
                int year = Integer.parseInt(input.trim());

                String message;
                if (isLeapYear(year)) {
                    message = year + " is a leap year.";
                } else {
                    message = year + " is not a leap year.";
                }

                JOptionPane.showMessageDialog(null, message, "Leap Year Result", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid numeric year.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}