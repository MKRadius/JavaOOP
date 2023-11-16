public class Bus extends AbstractVehicle {
    public Bus(String fuel, int capacity) {
        super("Bus", fuel, capacity);
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuel());
        System.out.println("capacity: " + getCapacity());
    }

    @Override
    public void charge() {
        System.out.println("Unable to charge " + getType());
    }
}
