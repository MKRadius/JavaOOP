import eduni.distributions.ContinuousGenerator;
import eduni.distributions.Negexp;


public class ArrivalProcess {
    private ContinuousGenerator generator;
    private EventList eventList;
    private EventType type;

    public ArrivalProcess(ContinuousGenerator generator, EventList eventList, EventType type) {
        this.generator = generator;
        this.eventList = eventList;
        this.type = type;
    }

    public double generateNextEvent() {
        double eventTime = Clock.getInstance().getClock() + generator.sample();
        Event event = new Event(type, eventTime);
        eventList.add(event);

        return eventTime;
    }

    public static void main(String[] args) {
        EventList list = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess(new Negexp(10), list, EventType.ARRIVAL);

        for (int i = 0; i < 10; i++) {
            Clock.getInstance().setClock(arrivalProcess.generateNextEvent());
        }

        list.print();
    }
}
