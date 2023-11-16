public class Bus extends AbstractVehicle {
    public Bus(String fuelType, int fuelTank, int capacity) {
        super("Bus", fuelType, fuelTank, capacity);
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuelType());
        System.out.println("capacity: " + getCapacity());
    }

    @Override
    public void charge() {
        System.out.println("Unable to charge " + getType());
    }
    
    @Override
    public void printFuelEfficiency() {
        System.out.println("Fuel efficiency: " + calculateFuelEfficiency() + " l/km");
    }
}
