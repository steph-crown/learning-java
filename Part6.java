void main() {
//    Menu menu = new Menu();
//    menu.addMeal("Tofu ratatouille");
//    menu.addMeal("Chilli coconut chicken");
//    menu.addMeal("Chilli coconut chicken");
//    menu.addMeal("Meatballs with mustard sauce");
//
//    menu.printMeals();
//    menu.clearMenu();
//
//    System.out.println();
//    menu.addMeal("Tomato and mozzarella salad");
//    menu.printMeals();

    Scanner scanner = new Scanner(System.in);
    UserInterface userInterface = new UserInterface(scanner);

    userInterface.run();
}