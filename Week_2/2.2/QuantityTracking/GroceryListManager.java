import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private Map<String, Double> groceryList = new HashMap<>();
    private Map<String, String> groceryCategory = new HashMap<>();
    private Map<String, Integer> groceryQuantity = new HashMap<>();
    
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

            System.out.println(i++ + ". " + name + " - " + price);
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
        System.out.println("Item " + item + " added to category " + category);
    }

    public void displayByCategory(String category) {
        if (groceryCategory.containsValue(category)) {
            int i = 1;
            System.out.println("Items in the " + category + " category:");

            for (Map.Entry<String, String> item : groceryCategory.entrySet()) {
                if (item.getValue() == category) {
                    System.out.println(i++ + ". " + item.getKey());
                }
            }
        }
        else {
            System.out.println("Category \"" + category + "\" not found");
        }
    }

    public void addItemWithQuantity(String item, int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid quantity");
            return;
        }
        else {
            groceryQuantity.put(item, quantity);
            System.out.println("Item " + item + " added with quantity of " + quantity);
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        if (!groceryQuantity.containsKey(item)) {
            System.out.println("Item \"" + item + "\" not found");
            return;
        }
        else if (newQuantity < 0) {
            System.out.println("Invalid quantity");
            return;
        }
        else {
            groceryQuantity.put(item, newQuantity);
            System.out.println("Item " + item + " updated with quantity of " + newQuantity);
        }
    }

    public void displayAvailableItems() {
        int i = 1;

        for (Map.Entry<String, Integer> item : groceryQuantity.entrySet()) {
                if (item.getValue() > 0) {
                    System.out.println(i++ + ". " + item.getKey() + " - Quantity: " + item.getValue());
                }
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

        // Add items to categories
        gList.addItemWithCategory("Apples", "Fruits");
        gList.addItemWithCategory("Oranges", "Fruits");
        gList.addItemWithCategory("Milk", "Dairy");
        gList.addItemWithCategory("Bread", "Bakery");
        System.out.println("");

        // Display items in category
        gList.displayByCategory("Fruits");
        System.out.println("");

        // Add items with quantities
        gList.addItemWithQuantity("Apples", 10);
        gList.addItemWithQuantity("Oranges", 7);
        gList.addItemWithQuantity("Milk", 5);
        gList.addItemWithQuantity("Bread", 0);
        System.out.println("");

        // Check quantities
        gList.displayAvailableItems();
        System.out.println("");

        // Change quantities
        gList.addItemWithQuantity("Milk", 3);
        gList.addItemWithQuantity("Bread", 11);
        System.out.println("");

        // Check quantities
        gList.displayAvailableItems();
        System.out.println(""); 
    }
}