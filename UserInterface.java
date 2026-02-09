import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    private final ArrayList<String> words;

    public UserInterface(Scanner scanner) {
        this.words = new ArrayList<>();
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            System.out.print("Write a word: ");
            String word = scanner.nextLine().trim();

            if (words.contains(word)) {
                System.out.println("You wrote the same word twice!");
                break;
            }

            words.add(word);
        }
    }
}
