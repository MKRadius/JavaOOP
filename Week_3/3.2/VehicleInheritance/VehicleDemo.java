public class VehicleDemo {
    public static void main(String[] args) {
        Car car                 = new Car("Petrol", "Red");
        Motorcycle motorcycle   = new Motorcycle("Gasoline", "Black");
        Bus bus                 = new Bus("Diesel", 40);

        System.out.println("Vehicle Demonstration");
        System.out.println("");

        car.start();
        car.stop();
        car.getInfo();
        System.out.println("");

        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        System.out.println("");


        bus.start();
        bus.stop();
        bus.getInfo();
        System.out.println("");

    }
}