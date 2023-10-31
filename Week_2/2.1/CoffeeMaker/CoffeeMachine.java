public class CoffeeMachine {
    private String coffeeType;
    private int coffeeAmount;
    private boolean machineOn = false;

    public CoffeeMachine(String type, int amount) {
        this.coffeeType = type;
        this.coffeeAmount = amount;
    }

    public String getType() {
        return coffeeType;
    }

    public int getAmount() {
        return coffeeAmount;
    }

    public void changeType() {
        if (machineOn) {
            if (coffeeType == "normal") {
                coffeeType = "espresso";
            }
            else {
                coffeeType = "espresso";
            }
        }
        else {
            System.out.println("Can't change type when machine is off");
        } 
    }

    public void changeAmount(int newAmount) {
        if (newAmount >= 10 || newAmount <= 80) {
            coffeeAmount = newAmount;
        }
        else {
            System.out.println("Amount must be 10-80ml");
        }
    }

    public void switchOnOff() {
        machineOn = !machineOn;
    }

    public void makeCoffee() {
        System.out.println("Your " + coffeeAmount + "ml " + coffeeType + " is commpleted. Enjoy!");
    }
}