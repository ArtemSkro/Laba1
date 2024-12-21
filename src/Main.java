import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Food> breakfast = new ArrayList<>();

        for (String arg : args) {
            if (arg.equals("-calories") || arg.equals("-sort")) {
                continue;
            } else if (arg.equals("-exit")) {
                break;
            }

            String[] parts = arg.split("/");
            switch (parts[0]) {
                case "Cheese":
                    breakfast.add(new Cheese());
                    break;
                case "Apple":
                    breakfast.add(new Apple(parts[1]));
                    break;
                case "Coffee":
                    breakfast.add(new Coffee(parts[1]));
                    break;
                case "Bubblegum":
                    breakfast.add(new Bubblegum());
                default:
                    System.out.println("Неизвестный продукт: " + parts[0]);
            }
        }

        double totalCalories = 0.0;
        if (Arrays.asList(args).contains("-calories")) {
            for (Food item : breakfast) {
                totalCalories += ((Nutritious) item).calculateCalories();
            }
            System.out.println("Общая калорийность завтрака: " + totalCalories);
        }

        if (Arrays.asList(args).contains("-sort")) {
            breakfast.sort(new FoodComparator());
            System.out.println("Завтрак отсортирован по калорийности.");
        }
        System.out.println(breakfast);

        for (Food item : breakfast) {
            item.consume();
        }

    }
}