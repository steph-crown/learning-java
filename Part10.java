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

    ArrayList<Integer> fuck =
            inputs.stream().map(Integer::parseInt).collect(Collectors.toCollection(ArrayList
                    ::new));

    // printing out the statistics
    System.out.println("Divisible by three " + numbersDivisibleByThree);
    System.out.println("Average number: " + average);
    System.out.println("int[], " + fuck);
}

public enum Color {
    // constructor parameters are defined as
    // the constants are enumerated
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private final String code;        // object reference variable

    private Color(String code) { // constructor
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}