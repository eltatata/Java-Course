import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the fruit shop!");

        Map<String, Integer> fruits = new LinkedHashMap<>();

        fruits.put("apple", 100);
        fruits.put("banana", 50);
        fruits.put("orange", 80);
        fruits.put("kiwi", 120);
        fruits.put("mango", 150);
        fruits.put("grapes", 200);
        fruits.put("watermelon", 300);

        System.out.println("Fruits available in the shop are: ");
        for (String fruit : fruits.keySet()) {
            System.out.println(fruit.toUpperCase() + " --> $" + fruits.get(fruit));
        }

        System.out.println("Total number of fruits available in the shop: " + fruits.size());
        System.out.println();
        
        if (fruits.containsKey("apple")) {
            System.out.println("Yes, apple is available in the shop.");
        } else {
            System.out.println("No, apple is not available in the shop.");
        } 
        System.out.println();

        fruits.remove("banana");
        System.out.println("Banana is removed from the shop.");
        System.out.println();

        System.out.println("Fruits available in the shop after removing banana are: ");
        for (String fruit : fruits.keySet()) {
            System.out.println(fruit.toUpperCase() + " --> $" + fruits.get(fruit));
        }
        System.out.println();

        fruits.put("papaya", 250);
        fruits.put("strawberry", 180);
        System.out.println("Papaya and strawberry are added to the shop.");
        System.out.println();

        System.out.println("Fruits available in the shop after adding papaya and strawberry are: ");
        for (String fruit : fruits.keySet()) {
            System.out.println(fruit.toUpperCase() + " --> $" + fruits.get(fruit));
        }
        System.out.println("Total number of fruits available in the shop: " + fruits.size());
    }   
}
