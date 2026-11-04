import javax.swing.JOptionPane;

public class fourthjoptionJava {
    public static void main(String[] args) {
        try {
            String heightStr = JOptionPane.showInputDialog(null, "Enter height (in cm):");
            if (heightStr == null) return; // Exit if cancelled
            double height = Double.parseDouble(heightStr);

            String ageStr = JOptionPane.showInputDialog(null, "Enter age:");
            if (ageStr == null) return;
            int age = Integer.parseInt(ageStr);

            String citizenshipStr = JOptionPane.showInputDialog(null, "Enter citizenship code ('C' for Endor, 'N' for non-citizen):");
            if (citizenshipStr == null) return;
            char citizenship = citizenshipStr.toUpperCase().charAt(0);

            String recommendeeStr = JOptionPane.showInputDialog(null, "Enter recommendee code ('R' for Obi Wan, 'N' for non-recommendee):");
            if (recommendeeStr == null) return;
            char recommendee = recommendeeStr.toUpperCase().charAt(0);

            String result;
            if (recommendee == 'R') {
                result = "Result: Accepted (Automatic acceptance via Jedi Master Obi Wan)";
            } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
                result = "Result: Accepted";
            } else {
                result = "Result: Rejected";
            }

            JOptionPane.showMessageDialog(null, result, "Admission Result", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid numeric input entered!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}