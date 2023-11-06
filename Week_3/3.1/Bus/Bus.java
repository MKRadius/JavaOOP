public class Bus extends Car {
    private int passengerCount;

    public Bus() {
        super("Bus", 500, 100);
    }

    public Bus(String name, int capacity, int topSpeed) {
        super(name, capacity, topSpeed);
    }

    public int getPassengerCount() {
        return this.passengerCount;
    }

    public void passengerEnter() {
        this.passengerCount++;
    }

    public void passengerExit() {
        this.passengerCount--;
    }
}
