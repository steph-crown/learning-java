void main() {
//    readAndAddNumbers();
//    printAndLoop();
    countOnes();
}

public static void countOnes() {
    /*
        Let's create a program to count and print out the number of ones entered by the user. Let's
        first create a non-working version and examine the action of the blocks.
     */
    Scanner scanner = new Scanner(System.in);
    int onesCount = 0;

    while (true) {
        System.out.println("Enter new number (0 exits)");
        int number = Integer.parseInt(scanner.nextLine());

        if (number == 1) {
            onesCount += 1;
        } else if (number == 0) {
            break;
        }

        System.out.println("The number of ones is " + onesCount);
    }
}

public static void printAndLoop() {
/*
        Write a program that asks the user for numbers. If the number is negative (smaller than
        zero), the program prints for user "Unsuitable number" and asks the user for a new number.
        If the number is zero, the program exits the loop. If the number is positive, the program
        prints the number to the power of two.
 */
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Enter a new number");
        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0) {
            break;
        } else if (num > 0) {
            System.out.println(Math.pow(num, 2));
        } else {
            System.out.println("Unsuitable number");
        }
    }

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