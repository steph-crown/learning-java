void main() {
    Scanner scanner = new Scanner(System.in);
    Container first = new Container("first", 100);
    Container second = new Container("second");

    while (true) {
        String input = scanner.nextLine();

        if (input.equals("quit")) {
            break;
        }

        String[] tokens = input.split(" ");
        String command = tokens[0];

        int value;
        try {
            value = Integer.parseInt(tokens[1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid input, try again");
            continue;
        }

        switch (command) {
            case "add":
                try {
                    first.add(value);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "move":
                try {
                    first.remove(value);
                    second.add(value);
                } catch (Exception err) {
                    String errorCode = err.getMessage();
                    if (errorCode.equals("exceeds_limit")) {
                        first.add(value);
                    }
                    System.out.println(errorCode);
                }
                break;
            case "remove":
                try {
                    second.remove(value);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            case null, default:
                System.out.println("Invalid input, try again");
        }

        System.out.println(first);
        System.out.println(second);
    }
}