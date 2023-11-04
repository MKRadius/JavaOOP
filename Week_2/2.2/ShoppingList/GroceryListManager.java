import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class ShoppingList {
    private String purpose;
    private Map<String, Double> groceryList = new HashMap<>();
    private Map<String, String> groceryCategory = new HashMap<>();
    private Map<String, Integer> groceryQuantity = new HashMap<>();

    public ShoppingList(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

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

        System.out.println(purpose + " list:");

        for (Map.Entry<String, Double> item : groceryList.entrySet()) {
            String name = item.getKey();
            Double price = item.getValue();

            System.out.println((i++) + ". " + name + " - " + price);
        }

        System.out.println("");
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
                    System.out.println((i++) + ". " + item.getKey());
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
                    System.out.println((i++) + ". " + item.getKey() + " - Quantity: " + item.getValue());
                }
            }
    }
}

public class GroceryListManager {
    private ArrayList<ShoppingList> shoppingLists = new ArrayList<>();

    public ShoppingList addShoppingList(String purpose) {
        ShoppingList list = new ShoppingList(purpose);
        shoppingLists.add(list);
        return list;
    }

    public void removeShoppingList(ShoppingList shoppingList) {
        shoppingLists.remove(shoppingList);
    }

    public void displayAllShoppingLists() {
        int i = 1;
        System.out.println("All shopping lists: ");
        
        for (ShoppingList list : shoppingLists) {
            System.out.println((i++) + ". " + list.getPurpose());
        }

        System.out.println("");
    }


    public static void main(String[] args) {
        GroceryListManager glManager = new GroceryListManager();

        ShoppingList bbq = glManager.addShoppingList("Backyard BBQ");
        ShoppingList camp = glManager.addShoppingList("Weekend Camping");

        glManager.displayAllShoppingLists();

        bbq.addItem("Meat", 19.99);
        bbq.addItem("Sausages", 9.99);
        bbq.addItem("Mushrooms", 4.49);
        bbq.displayList();

        System.out.println(bbq.getPurpose() + " total price: " + String.format("%.2f", bbq.calculateTotalCost()));
        System.out.println("");

        bbq.removeItem("Sausages");
        bbq.displayList();
        
        System.out.println(bbq.getPurpose() + " total price: " + String.format("%.2f", bbq.calculateTotalCost()));
        System.out.println("");

        camp.addItem("Tents", 39.99);
        camp.addItem("Lamps", 14.99);
        camp.displayList();

        System.out.println(camp.getPurpose() + " total price: " + String.format("%.2f", camp.calculateTotalCost()));
        System.out.println("");

        glManager.removeShoppingList(camp);
        glManager.displayAllShoppingLists();
    }
}