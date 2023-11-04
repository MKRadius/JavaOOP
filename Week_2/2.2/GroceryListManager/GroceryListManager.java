import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    
    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
        }
        else {
            System.out.println("\"" + item + "\" not found");
        }
    }

    public void displayList() {
        for (String item : groceryList) {
            System.out.println(groceryList.indexOf(item) + 1 + ". " + item);
        }
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager gList = new GroceryListManager();

        gList.addItem("Apples");
        gList.addItem("Milk");
        gList.addItem("Bread");

        System.out.println("Grocery List:");
        gList.displayList();
        System.out.println("");

        System.out.println("Is \"Milk\" in the grocery list? " + gList.checkItem("Milk"));
        System.out.println("");

        System.out.println("Removing \"Milk\" from the list...");
        gList.removeItem("Milk");
        System.out.println("");

        System.out.println("Grocery List:");
        gList.displayList();
        System.out.println("");
    }
}