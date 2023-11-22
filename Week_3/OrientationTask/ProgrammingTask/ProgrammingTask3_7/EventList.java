import java.util.PriorityQueue;
import java.util.Random;

public class EventList {
    private PriorityQueue<Event> eventList;

    public EventList() {
        eventList = new PriorityQueue<>();
    }

    public void add(Event e) {
        System.out.println("Add: <" + e.getType() + "> " + e.getTime());
        eventList.add(e);
    }

    // public void remove() {
    //     System.out.println("Remove: " + + eventList.peek().getTime() +" <" + eventList.peek().getType() + ">");
    //     eventList.remove();
    // }

    public Event remove() {
        if (eventList.isEmpty()) {
            return null;
        }

        System.out.println("Remove: " + + eventList.peek().getTime() +" <" + eventList.peek().getType() + ">");
        
        return eventList.remove();
    }

    public boolean isEmpty() {
        return (eventList.size() == 0) ? true : false;
    }

    public void print() {
        for (Event e : eventList) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        EventList list = new EventList();
        Random random = new Random();
        EventType type;

        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean())
                type = EventType.ARRIVAL;
            else
                type = EventType.DEPARTURE;
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