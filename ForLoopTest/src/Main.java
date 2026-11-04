import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        //Pyramid
        for (int i=1; i<=n-1; i++) {
            for (int j=i; j<=n; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Inverted Pyramid
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Half Diamond Left Aligned
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++) {
            for (int j=i; j<=n-1; j++) {
                System.out.print("* ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }

        //Half Diamond Right Aligned
        for (int i=1; i<=n; i++) {
            for (int j=i; j<=n-1; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=n-1; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("  ");
            }
            for (int j=i; j<=n-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}