import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.println("Please Enter Your Name: ");
        try {
            name = dataln.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hello " + name + "!");
    }
}