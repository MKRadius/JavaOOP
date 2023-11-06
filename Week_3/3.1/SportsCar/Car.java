public class Car {
    protected float speed;
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
        if (this.speed < topSpeed) {
            if (gasolineLevel > 0)
                speed += 1;
            else
                speed = 0;
        }
    }
    
    public void decelerate() {
        if (gasolineLevel > 0) {
            speed = Math.max(0, speed - 1);
        } else
            speed = 0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGasolineLevel(float level) {
        this.gasolineLevel = level;
    }

    public float getSpeed() {
        return speed;
    }

    public float getTopSpeed() {
        return this.topSpeed;
    }

    public float getGasolineLevel() {
        return this.gasolineLevel;
    }

    public float getGasolineCapacity() {
        return this.gasolineCapacity;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = gasolineCapacity;
    }
}