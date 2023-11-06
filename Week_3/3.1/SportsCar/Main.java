public class Main {
    public static void main(String[] args) {
        SportsCar porsche = new SportsCar("Porsche 911", 200, 315);

        porsche.fillTank();

        // Accelerate to max speed until out of gas
        while (porsche.getSpeed() < porsche.getTopSpeed() && porsche.getGasolineLevel() > 0) {            
            porsche.accelerate();
            System.out.println(porsche.getTypeName() + ": speed is " + porsche.getSpeed() + " km/h");
        
            if (porsche.getGasolineLevel() == 0 ) {
                System.out.println(porsche.getTypeName() + " is out of gas");
            }
        }

        // Decelerate after running out of gas
        while (porsche.getSpeed() > 0) {
            porsche.decelerate();
            System.out.println(porsche.getTypeName() + ": speed is " + porsche.getSpeed() + " km/h");
        }

        // Refill gas
        porsche.fillTank();

        // Accelerate to 100km/h
        while (porsche.getSpeed() < 100 && porsche.getGasolineLevel() > 0) {
            porsche.accelerate();
            System.out.println(porsche.getTypeName() + ": speed is " + porsche.getSpeed() + " km/h");
        }

        // Decelerate to 50km/h
        while (porsche.getSpeed() > 40 && porsche.getGasolineLevel() > 0) {
            porsche.decelerate();
            System.out.println(porsche.getTypeName() + ": speed is " + porsche.getSpeed() + " km/h");
        }
    }
}
