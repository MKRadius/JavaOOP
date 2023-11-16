abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private String type;
    private String fuel;
    private String color;
    private int capacity;

    AbstractVehicle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }
    
    AbstractVehicle(String type, String fuel, int capacity) {
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }
    
    public String getFuel() {
        return fuel;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void start() {
        System.out.println(type + " is starting...");
    }

    public void stop() {
        System.out.println(type + " is stopping...");
    }

    public abstract void getInfo();

    public abstract void charge();
}