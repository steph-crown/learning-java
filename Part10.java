void main() {
    // We initialise the scanner and the list into which the input is read
    Scanner scanner = new Scanner(System.in);
    List<String> inputs = new ArrayList<>();

    // reading inputs
    while (true) {
        String row = scanner.nextLine();
        if (row.equals("end")) {
            break;
        }

        inputs.add(row);
    }

    // counting the number of values divisible by three
    long numbersDivisibleByThree = inputs.stream()
            .mapToInt(Integer::parseInt)
            .filter(number -> number % 3 == 0)
            .count();

    // working out the average
    double average = inputs.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .getAsDouble();

    int[] fuck = inputs.stream().mapToInt(Integer::parseInt).toArray();

    // printing out the statistics
    System.out.println("Divisible by three " + numbersDivisibleByThree);
    System.out.println("Average number: " + average);
    System.out.println("int[], " + Arrays.toString(fuck));
}
