void main() {
//    Scanner scanner = new Scanner(System.in);
//    Container first = new Container("first", 100);
//    Container second = new Container("second", 100);
//
//    while (true) {
//        String input = scanner.nextLine();
//
//        if (input.equals("quit")) {
//            break;
//        }
//
//        String[] tokens = input.split(" ");
//        String command = tokens[0];
//
//        int value;
//        try {
//            value = Integer.parseInt(tokens[1]);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("Invalid input, try again");
//            continue;
//        }
//
//        switch (command) {
//            case "add":
//                first.add(value);
//                break;
//            case "move":
//                int valueToMove = Math.min(value, first.contains());
//                first.remove(valueToMove);
//                second.add(valueToMove);
//                break;
//            case "remove":
//                second.remove(value);
//                break;
//            case null, default:
//                System.out.println("Invalid input, try again");
//        }
//
//        System.out.println(first);
//        System.out.println(second);
//    }

    HashMap<String, String> map = new HashMap<>();
    map.put("jsjs", "sksk");
    map.put("msss", "sksk");
    map.replace("jsjs", "isaiaia");
    System.out.println("map " + map.toString() + " " + map.get("jsjs"));
}