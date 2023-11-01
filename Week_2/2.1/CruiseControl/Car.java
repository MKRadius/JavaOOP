public class Car {
    private float speed;
    private float topSpeed;
    private float gasolineLevel;
    private float gasolineCapacity;
    private String typeName;

    private float ccTargetSpeed;
    private boolean ccTurnOn = false;


    public Car(String typeName, int capacity, int topSpeed) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName; 
        this.gasolineCapacity = capacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (this.speed <= (topSpeed - 10)) {
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

    public float getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = gasolineCapacity;
    }

    public float getGasolineLevel() {
        return gasolineLevel;
    }



    public void setCruiseControlTargetSpeed(int targetSpeed) {
        ccTargetSpeed = (float) targetSpeed;
    }

    public float getCruiseControlTargetSpeed() {
        return ccTargetSpeed;
    }

    public void toggleCruiseControl() {
        if (ccTurnOn) {
            ccTurnOn = false;
            System.out.println("Cruise control is now off.");
        }
        else {
            ccTurnOn = true;
            System.out.println("Cruise control is now on."); 
        }
    }

    public void useCruiseControl() {
        if (ccTurnOn) {
            if (ccTargetSpeed < 0 || ccTargetSpeed > topSpeed) {
                System.out.println("Cruise control target speed invalid");
            }
            else if (ccTargetSpeed > speed) {
                while (ccTargetSpeed > speed) {
                    this.accelerate();
                    if (speed % 10.0 == 0) {
                        System.out.println(this.getTypeName() + ": speed is " + this.getSpeed() + " km/h");
                    }
                }
            }
            else if (ccTargetSpeed < speed) {
                while (ccTargetSpeed < speed) {
                    this.decelerate();
                    if (speed % 10.0 == 0) {
                        System.out.println(this.getTypeName() + ": speed is " + this.getSpeed() + " km/h");
                    }                 
                }
            }
            else {
                System.out.println("Cruise control is maintaining target speed.");
            }
        }
        else {
            System.out.println("Cruise control is off.");
        }
    }   
}