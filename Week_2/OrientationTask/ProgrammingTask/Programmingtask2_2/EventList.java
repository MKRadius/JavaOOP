import java.util.PriorityQueue;
import java.util.Random;

public class EventList {
    private PriorityQueue<Event> eventList;

    public EventList() {
        eventList = new PriorityQueue<>();
    }

    public void add(Event e) {

    }

    public Event remove() {
        return new Event(null, 0);
    }

    public void print() {

    }

    public static void main(String[] args) {
        EventList list = new EventList();
        Random random = new Random();
        String type;

        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean())
                type = "Arrival";
            else
                type = "Departure";
            list.add(new Event(type, random.nextInt(1000)));
        }

        System.out.println("Event removed: " + list.remove());


        list.print();
    }
}