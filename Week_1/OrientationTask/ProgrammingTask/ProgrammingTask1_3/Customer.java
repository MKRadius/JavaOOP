class CustomerIdGenerator {
    private static int currentId = 1;

    public static int getNextId() {
        return currentId++;
    }
}

public class Customer {
    
    private int id;
    private long startTime;
    private long endTime;

    public Customer() {
        this.id = CustomerIdGenerator.getNextId();
        this.startTime = 0;
        this.endTime = 0;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }

}