public class VehicleDemo {
    public static void main(String[] args) {
        Car car                 = new Car("Petrol", 300, "Red");
        Motorcycle motorcycle   = new Motorcycle("Gasoline", 150, "Black");
        Bus bus                 = new Bus("Diesel", 500, 40);
        ElectricCar eCar        = new ElectricCar(400, "Gray");
        ElectricMotorcycle eBike = new ElectricMotorcycle(200, "Green");

        System.out.println("Vehicle Demonstration");
        System.out.println("");

        car.start();
        car.setTotalTravelDistance(100);
        car.stop();
        car.printFuelEfficiency();
        car.charge();
        car.getInfo();
        System.out.println("");

        motorcycle.start();
        motorcycle.setTotalTravelDistance(100);
        motorcycle.stop();
        motorcycle.printFuelEfficiency();
        motorcycle.charge();
        motorcycle.getInfo();
        System.out.println("");

        bus.start();
        bus.setTotalTravelDistance(100);
        bus.stop();
        bus.printFuelEfficiency();
        bus.charge();
        bus.getInfo();
        System.out.println("");

        eCar.start();
        eCar.setTotalTravelDistance(100);
        eCar.stop();
        eCar.printFuelEfficiency();
        eCar.charge();
        eCar.getInfo();
        System.out.println("");

        eBike.start();
        eBike.setTotalTravelDistance(100);
        eBike.stop();
        eBike.printFuelEfficiency();
        eBike.charge();
        eBike.getInfo();
        System.out.println("");
    }
}