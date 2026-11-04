import javax.swing.*;

public class secondjoptionJava {
    static void main(String[] args) {
        String rateInput = JOptionPane.showInputDialog(null, "Enter hourly pay rate (Php): ");
        double payRate = Double.parseDouble(rateInput);

        String hoursInput = JOptionPane.showInputDialog(null, "Enter hours worked: ");
        double hoursWorked = Double.parseDouble(hoursInput);

        double grossPay = payRate * hoursWorked;
        double taxRate = 0.0;

        if (grossPay <= 2000.00) {
            taxRate = 0.10;
        } else if (grossPay <= 4000.00) {
            taxRate = 0.12;
        } else if (grossPay <= 10000.00) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        String result = String.format("--- Payroll Summary ---\n" + "Gross Pay: Php %.2f\n" + "Withholding (%.0f%%): Php %.2f\n" + "Net Pay: Php %.2f", grossPay, (taxRate * 100), withholdingTax, netPay
        );

        JOptionPane.showMessageDialog(null, result, "Payroll Results", JOptionPane.INFORMATION_MESSAGE);2
    }
}