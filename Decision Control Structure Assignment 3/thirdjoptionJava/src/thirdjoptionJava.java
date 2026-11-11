import javax.swing.JOptionPane;

public class thirdjoptionJava {
    public static void main(String[] args) {
        try {
            String nsatStr = JOptionPane.showInputDialog("Enter NSAT score:");
            if (nsatStr == null) return;
            double nsatScore = Double.parseDouble(nsatStr);

            String salaryStr = JOptionPane.showInputDialog("Enter parents' monthly salary:");
            if (salaryStr == null) return;
            double parentsSalary = Double.parseDouble(salaryStr);

            String entranceStr = JOptionPane.showInputDialog("Enter entrance examination score:");
            if (entranceStr == null) return;
            double entranceScore = Double.parseDouble(entranceStr);

            String result;

            if (parentsSalary > 10000 || nsatScore < 90 || entranceScore < 85) {
                result = "Rejected";
            } else if (parentsSalary <= 3500 && ((nsatScore + entranceScore) / 2.0) >= 91) {
                result = "Accepted";
            } else {
                result = "For further study";
            }

            JOptionPane.showMessageDialog(null, "Application Result: " + result,
                    "Scholarship Status", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}