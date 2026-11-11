import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class thirdbufferedreaderJava {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsatScore = Double.parseDouble(reader.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double parentsSalary = Double.parseDouble(reader.readLine());

        System.out.print("Enter entrance examination score: ");
        double entranceScore = Double.parseDouble(reader.readLine());

        // Evaluation Logic
        if (parentsSalary > 10000 || nsatScore < 90 || entranceScore < 85) {
            System.out.println("Result: Rejected");
        } else if (parentsSalary <= 3500 && ((nsatScore + entranceScore) / 2.0) >= 91) {
            System.out.println("Result: Accepted");
        } else {
            System.out.println("Result: For further study");
        }
    }
}