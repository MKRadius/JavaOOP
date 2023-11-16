public class Bus extends AbstractVehicle {
    public Bus(String fuel, int capacity) {
        super("Bus", fuel, capacity);
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
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuel());
        System.out.println("Capacity: " + getCapacity() + " passengers");
    }
}
