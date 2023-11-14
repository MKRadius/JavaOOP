import java.util.PriorityQueue;
import java.util.Random;

public class EventList {
    private PriorityQueue<Event> eventList;

    public EventList() {
        eventList = new PriorityQueue<>();
    }

    public void add(Event e) {
        System.out.println("Add: " + e.getType() + " " + e.getTime());
        eventList.add(e);
    }

    public void remove() {
        System.out.println("Remove: " + + eventList.peek().getTime() +" <" + eventList.peek().getType() + ">");
        eventList.remove();
    }

    public void print() {
        for (Event e : eventList) {
            System.out.println(e);
        }
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

        // Print the PriorityQueue list
        list.print();

        //Remove first event
        list.remove();

        // Print again
        list.print();
    }
}