import java.util.ArrayList;

public class Menu {
    private final ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        this.meals.add(meal);
    }

    public void printMeals() {
        System.out.println("Meals: \n");
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}
