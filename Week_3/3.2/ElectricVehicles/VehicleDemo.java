public class VehicleDemo {
    public static void main(String[] args) {
        Car car                 = new Car("Petrol", "Red");
        Motorcycle motorcycle   = new Motorcycle("Gasoline", "Black");
        Bus bus                 = new Bus("Diesel", 40);
        ElectricCar eCar        = new ElectricCar("Gray");
        ElectricMotorcycle eBike = new ElectricMotorcycle("Green");

        System.out.println("Vehicle Demonstration");
        System.out.println("");

        car.start();
        car.stop();
        car.charge();
        car.getInfo();
        System.out.println("");

        motorcycle.start();
        motorcycle.stop();
        motorcycle.charge();
        motorcycle.getInfo();
        System.out.println("");

        bus.start();
        bus.stop();
        bus.charge();
        bus.getInfo();
        System.out.println("");

        eCar.start();
        eCar.stop();
        eCar.charge();
        eCar.getInfo();
        System.out.println("");

        eBike.start();
        eBike.stop();
        eBike.charge();
        eBike.getInfo();
        System.out.println("");
    }
}