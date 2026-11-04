import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secondbufferedreaderJava {
    static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter hourly pay rate (Php): ");
        double payRate = Double.parseDouble(reader.readLine());

        System.out.println("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(reader.readLine());

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

        System.out.printf("\n--- Payroll Summary ---\n");
        System.out.printf("Gross Pay: Php %.2f\n", grossPay);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f\n", (taxRate * 100), withholdingTax);
        System.out.printf("Net Pay: Php %.2f\n", netPay);
    }
}