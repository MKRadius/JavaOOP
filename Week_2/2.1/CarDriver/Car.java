public class Car {
    private float speed;
    private float topSpeed;
    private float gasolineLevel;
    private float gasolineCapacity;
    private String typeName;

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
    
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    float getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = gasolineCapacity;
    }

    float getGasolineLevel() {
        return gasolineLevel;
    }
}