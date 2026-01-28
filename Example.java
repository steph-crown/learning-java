import java.io.InputStream;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fuck yeah, Text to be printed");
        String message = scanner.nextLine();
        boolean bool = Boolean.parseBoolean(message);
        System.out.println("message: " + (bool && false));

        int s = 3;
        double kl = s;
        int j = s;


    }
}