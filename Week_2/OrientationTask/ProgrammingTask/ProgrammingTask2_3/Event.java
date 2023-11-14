public class Event implements Comparable<Event> {
    private long time;
    private EventType type;

    public Event(EventType type, long time) {
        this.type = type;
        this.time = time;
    }

    public long getTime() {
        return this.time;
    }

    public EventType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return time + " <" + type + ">";
    }

    @Override
    public int compareTo(Event e) {
        if (time < e.time) {
            return -1;
        }
        else if (time > e.time) {
            return 1;
        }
        else return 0;
    }
}
