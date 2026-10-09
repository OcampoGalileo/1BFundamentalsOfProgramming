import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class fourthbufferedreaderJava {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--- Jedi Knight Military Academy Admission System (BufferedReader) ---");

        System.out.print("Enter height (in cm): ");
        double height = Double.parseDouble(reader.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.print("Enter citizenship code ('C' for Endor, 'N' for non-citizen): ");
        char citizenship = reader.readLine().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code ('R' for Obi Wan, 'N' for non-recommendee): ");
        char recommendee = reader.readLine().toUpperCase().charAt(0);

        if (recommendee == 'R') {
            System.out.println("Result: Accepted (Automatic acceptance via Jedi Master Obi Wan)");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            System.out.println("Result: Accepted");
        } else {
            System.out.println("Result: Rejected");
        }
    }
}