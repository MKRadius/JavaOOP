public class SportsCar extends Car {

    public SportsCar(String typeName, int capacity, int topSpeed) {
        super(typeName, capacity, topSpeed);
    }

    @Override
    public void accelerate() {
        if (this.speed < this.getTopSpeed()) {
            if (this.speed + 20 > this.getTopSpeed()) {
                this.speed = this.getTopSpeed();
                this.setGasolineLevel(Math.max(0, this.getGasolineLevel() - 10));
            }
            else {
                this.speed += 20;
                this.setGasolineLevel(Math.max(0, this.getGasolineLevel() - 20));
            }  
        }
    }

    @Override
    public void decelerate() {
        speed = Math.max(0, speed - 30);
    }
}
