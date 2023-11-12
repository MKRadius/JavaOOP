public class Bus implements Vehicle {
    private String type;
    private String fuel;
    private int capacity;

    public Bus(String fuel, int capacity) {
        this.type = this.getClass().getName();
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Capacity: " + capacity + " passengers");
    }
}
