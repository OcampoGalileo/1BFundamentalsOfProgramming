public class Looping2BufferedReader {
    public static void main(String[] args) {
        System.out.println("Even numbers from 2 to 100:");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + "\t");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}