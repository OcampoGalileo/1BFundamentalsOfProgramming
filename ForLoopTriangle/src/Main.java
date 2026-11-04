import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        //Left-Aligned Right Angle Triangle
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        //Right-Aligned Right Angle Triangle
        for (int i=1; i<=n; i++) {
            for (int j=i; j<=n-1; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Inverted Right-Aligned Right Angle Triangle
        for (int i=1; i<=n; i++) {
            for (int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }

        //Left-Aligned Right Angle Triangle
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i-1; j++) {
                System.out.print("  ");
            }
            for (int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}