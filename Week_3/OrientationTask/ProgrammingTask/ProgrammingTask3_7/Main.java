import eduni.distributions.Negexp;

public class Main {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        ArrivalProcess arrProcess = new ArrivalProcess(new Negexp(10), eventList, EventType.ARRIVAL);
        ServicePoint svcPoint = new ServicePoint();

        for (int i = 0; i < 10; i++) {
            Clock.getInstance().setClock(arrProcess.generateNextEvent());
        }

        System.out.println("Last event: " + Clock.getInstance().getClock());

        do {
            Event e = eventList.remove();

            if (e != null) {
                if (e.getType() == EventType.ARRIVAL) {
                    Customer customer = new Customer(e.getTime());
                    svcPoint.addToQueue(customer);
                }
            }
        }
        while (!eventList.isEmpty());

        svcPoint.serve();

    }
}