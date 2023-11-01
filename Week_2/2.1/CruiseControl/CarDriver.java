public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 50, 190);
        myCar.fillTank();

        // for(int i = 0; i < 6; i++) {
        //     myCar.accelerate();
        //     System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        // }

        // while(myCar.getSpeed() > 0) {
        //     myCar.decelerate(15);
        //     System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        // }


        myCar.setCruiseControlTargetSpeed(150);
        myCar.toggleCruiseControl();
        myCar.useCruiseControl();
        myCar.toggleCruiseControl();
        

        myCar.setCruiseControlTargetSpeed(100);
        myCar.useCruiseControl(); // Test if car can use cruise control when it's off
        myCar.toggleCruiseControl();
        myCar.useCruiseControl();

        myCar.toggleCruiseControl();
    }
}