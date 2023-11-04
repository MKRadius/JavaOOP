import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private Map<String, Double> groceryList = new HashMap<>();
    private Map<String, String> groceryCategory = new HashMap<>();
    
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
        }
        else {
            System.out.println("\"" + item + "\" not found");
        }
    }

    public void displayList() {
        int i = 1;

        for (Map.Entry<String, Double> item : groceryList.entrySet()) {
            String name = item.getKey();
            Double price = item.getValue();

            System.out.println((i++) + ". " + name + " - " + price);
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double totalPrice = 0;

        for (Map.Entry<String, Double> item : groceryList.entrySet()) {
            totalPrice += item.getValue();
        }

        return totalPrice;
    }

    public void addItemWithCategory(String item, String category) {
        groceryCategory.put(item, category);
    }

    public void displayByCategory(String category) {
        if (groceryCategory.containsValue(category)) {
            int i = 1;
            System.out.println("Items in the " + category + " category:");

            for (Map.Entry<String, String> item : groceryCategory.entrySet()) {
                if (item.getValue() == category) {
                    System.out.println((i++) + ". " + item.getKey());
                }
            }
        }
        else {
            System.out.println("Category \"" + category + "\" not found");
        }
    }

    public static void main(String[] args) {
        GroceryListManager gList = new GroceryListManager();

        gList.addItem("Apples", 2.99);
        gList.addItem("Milk", 2.49);
        gList.addItem("Bread", 1.29);

        System.out.println("Grocery List:");
        gList.displayList();
        System.out.println("");

        System.out.println("Total cost: " + String.format("%.2f", gList.calculateTotalCost()));
        System.out.println("");

        System.out.println("Is \"Milk\" in the grocery list? " + gList.checkItem("Milk"));
        System.out.println("");

        System.out.println("Removing \"Milk\" from the list...");
        gList.removeItem("Milk");
        System.out.println("");

        System.out.println("Removing \"Chicken\" from the list...");
        gList.removeItem("Chicken");
        System.out.println("");

        System.out.println("Grocery List:");
        gList.displayList();
        System.out.println("");

        System.out.println("Total cost: " + String.format("%.2f", gList.calculateTotalCost()));
        System.out.println("");

        gList.addItemWithCategory("Apples", "Fruits");
        gList.addItemWithCategory("Oranges", "Fruits");
        gList.addItemWithCategory("Milk", "Dairy");
        gList.addItemWithCategory("Bread", "Bakery");

        gList.displayByCategory("Fruits");
        System.out.println("");
    }
}