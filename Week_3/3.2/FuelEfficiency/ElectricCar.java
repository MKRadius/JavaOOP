public class ElectricCar extends AbstractVehicle {
    public ElectricCar(int battery, String color) {
        super("ElectricCar", "Electric", battery, color);
    }

    @Override
    public void getInfo() {
        System.out.println("ElectricCar information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuelType());
        System.out.println("Color: " + getColor());
    }

    @Override
    public void charge() {
        System.out.println("Fully charged");
    }
        
    @Override
    public void printFuelEfficiency() {
        System.out.println("Fuel efficiency: " + calculateFuelEfficiency() + " kWh/km");
    }
}
