void main() {
    readAndAddNumbers();
}


public static void readAndAddNumbers() {
    /*
        Let's look into a problem "Read two integers from the user. If the sum of the
        integers is
        over 100, print too much. If the sum is less than 0, print too little. Otherwise,
        print ok.
        The program below combines reading, calculating and conditional functionality.
    */

    Scanner scanner = new Scanner(System.in);
    IO.println("Enter first number");
    int first = Integer.parseInt(scanner.nextLine());
    IO.println("Enter second number");
    int second = Integer.parseInt(scanner.nextLine());
    int sum = first + second;

    if (sum > 100) {
        IO.println("too much");
    } else if (sum < 0) {
        IO.println("too little");
    } else {
        IO.println("ok");
    }
}