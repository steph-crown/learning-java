import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner = new Scanner(System.in);

    private final ArrayList<String> words;

    public UserInterface() {
        this.words = new ArrayList<>();
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
