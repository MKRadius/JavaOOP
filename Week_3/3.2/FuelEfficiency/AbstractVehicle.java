abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private String type;
    private String fuelType;
    private int fuelCapacity;
    private String color;
    private int capacity;
    private int efficiency;
    private int totalTravelDistance;

    AbstractVehicle(String type, String fuelType, int fuelCapacity, String color) {
        this.type = type;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.color = color;
    }
    
    AbstractVehicle(String type, String fuelType, int fuelCapacity, int capacity) {
        this.type = type;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }
    
    public String getFuelType() {
        return fuelType;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setTotalTravelDistance(int distance) {
        this.totalTravelDistance = distance;
    }

    public double calculateFuelEfficiency() {
        return ((double) this.fuelCapacity) / this.totalTravelDistance;
    }

    public void start() {
        System.out.println(type + " is starting...");
    }

    public void stop() {
        System.out.println(type + " is stopping...");
    }

    public abstract void printFuelEfficiency();

    public abstract void getInfo();

    public abstract void charge();
}