public class Car {
    private float speed;
    private float topSpeed;
    private float gasolineLevel;
    private float gasolineCapacity;
    private String typeName;

    private float ccTargetSpeed;
    private boolean turnOn = false;


    public Car(String typeName, int capacity, int topSpeed) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName; 
        this.gasolineCapacity = capacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (speed <= (topSpeed - 10)) {
            if (gasolineLevel > 0)
                speed += 10;
            else
                speed = 0;
        }
    }
    
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    public float getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public fillTank() {
        gasolineLevel = gasolineCapacity;
    }

    public float getGasolineLevel() {
        return gasolineLevel;
    }

    public void useCruiseControl(int targetSpeed) {
        if (targetSpeed > topSpeed || targetSpeed < 0) {
            System.out.println("Can't reach desired speed");
        }
    }   
}