import java.util.Scanner;

public class thirdscannerJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsatScore = scanner.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double parentsSalary = scanner.nextDouble();

        System.out.print("Enter entrance examination score: ");
        double entranceScore = scanner.nextDouble();

        if (parentsSalary > 10000 || nsatScore < 90 || entranceScore < 85) {
            System.out.println("Result: Rejected");
        } else if (parentsSalary <= 3500 && ((nsatScore + entranceScore) / 2.0) >= 91) {
            System.out.println("Result: Accepted");
        } else {
            System.out.println("Result: For further study");
        }
    }
}