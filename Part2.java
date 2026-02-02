void main() {
//    readAndAddNumbers();
//    printAndLoop();
//    countOnes();
//    countPosAndNeg();
//    printFrom1ToN();
//    int ans = factorial(6);
//    System.out.println("Factorial " + ans);

//    System.out.println(divide(3, 3));
    divisibleByThreeInRange(2, 10);
}

public static void divisibleByThreeInRange(int beginning, int end) {
    for (int i = beginning; i <= end; i++) {
        if (i % 3 == 0) {
            System.out.println(i);
        }
    }
}

public static float divide(int x, int y) {
    return (float) x / y;
}

public static int factorial(int n) {
    if (n <= 1) return 1;

    return n * factorial(n - 1);
}

public static void printFrom1ToN() {
    /*
        Write a program which prints the integers from 1 to a number given by the user.
     */
    System.out.println("Enter a number");
    Scanner scanner = new Scanner(System.in);
    int count = Integer.parseInt(scanner.nextLine());

    for (int i = 1; i <= count; i++) {
        System.out.println(i);
    }
    

    return;
}

public static void countPosAndNeg() {
    /*
         a program which reads numbers from the user until the user writes 0. Then the program
         prints the number of positive and negative numbers given, and the percentage of positive
          numbers from all numbers given.
     */
    Scanner scanner = new Scanner(System.in);
    int pos = 0, neg = 0;

    while (true) {
        System.out.println("Enter number, nigga (0 exits)");
        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0) break;

        if (num > 0) {
            pos++;
        } else {
            neg++;
        }
    }

    float perc = (float) (pos * 100) / (pos + neg);

    System.out.println("Positives: " + pos + "\nNegatives: " + neg + "\n% of Positives: " + perc + "%");
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
    }

    System.out.println("The number of ones is " + onesCount);
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