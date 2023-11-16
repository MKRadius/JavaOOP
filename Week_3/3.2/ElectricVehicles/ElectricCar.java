public class ElectricCar extends AbstractVehicle {
    public ElectricCar(String color) {
        super("ElectricCar", "Electric", color);
    }

    @Override
    public void getInfo() {
        System.out.println("ElectricCar information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuel());
        System.out.println("Color: " + getColor());
    }

    @Override
    public void charge() {
        System.out.println("Fully charged");
    }
}
