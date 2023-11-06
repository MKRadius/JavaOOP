public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();

        System.out.println("There are " + bus.getPassengerCount() + " passengers on the bus");

        // 10 passengers enter the bus
        for (int i = 0; i < 10; i++) {
            bus.passengerEnter();
        }

        System.out.println("There are " + bus.getPassengerCount() + " passengers on the bus");

        // 5 passengers exit the bus
        for (int i = 0; i < 5; i++) {
            bus.passengerExit();
        }

        System.out.println("There are " + bus.getPassengerCount() + " passengers on the bus");

    }
}
