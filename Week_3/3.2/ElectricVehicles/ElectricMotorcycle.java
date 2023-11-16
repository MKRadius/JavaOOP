public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle(String color) {
        super("ElectricMotorcycle", "Electric", color);
    }

    @Override
    public void getInfo() {
        System.out.println("ElectricMotorcycle information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuel());
        System.out.println("Color: " + getColor());
    }

    @Override
    public void charge() {
        System.out.println("Fully charged");
    }
}
