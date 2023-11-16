public class Motorcycle extends AbstractVehicle {
    public Motorcycle(String fuel, String color) {
        super("Motorcycle", fuel, color);
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuel());
        System.out.println("Color: " + getColor());
    }

    @Override
    public void charge() {
        System.out.println("Unable to charge " + getType());
    }
}
