public class Car extends AbstractVehicle {
    public Car(String fuelType, int fuelTank, String color) {
        super("Car", fuelType, fuelTank, color);
    }

    @Override
    public void getInfo() {
        System.out.println("Car information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuelType());
        System.out.println("Color: " + getColor());
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
