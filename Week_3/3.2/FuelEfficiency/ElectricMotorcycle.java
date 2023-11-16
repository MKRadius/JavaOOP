public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle(int battery, String color) {
        super("ElectricMotorcycle", "Electric", battery, color);
    }

    @Override
    public void getInfo() {
        System.out.println("ElectricMotorcycle information:");
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
