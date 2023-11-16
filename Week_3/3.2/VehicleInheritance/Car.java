public class Car extends AbstractVehicle {
    public Car(String fuel, String color) {
        super("Car", fuel, color);
    }

    @Override
    public void getInfo() {
        System.out.println("Car information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuel());
        System.out.println("Color: " + getColor());
    }
}
