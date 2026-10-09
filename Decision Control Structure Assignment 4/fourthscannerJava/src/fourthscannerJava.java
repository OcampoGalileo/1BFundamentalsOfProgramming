import java.util.Scanner;

public class fourthscannerJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Jedi Knight Military Academy Admission System (Scanner) ---");

        System.out.print("Enter height (in cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter citizenship code ('C' for Endor, 'N' for non-citizen): ");
        char citizenship = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code ('R' for Obi Wan, 'N' for non-recommendee): ");
        char recommendee = scanner.next().toUpperCase().charAt(0);

        if (recommendee == 'R') {
            System.out.println("Result: Accepted (Automatic acceptance via Jedi Master Obi Wan)");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C') {
            System.out.println("Result: Accepted");
        } else {
            System.out.println("Result: Rejected");
        }

        scanner.close();
    }
}