class CustomerIdGenerator {
    private static int currentId = 1;

    public static int getNextId() {
        return currentId++;
    }
}

public class Customer {
    
    private int id;
    private long startQueueTime;
    private long endQueueTime;

    public Customer() {
        this.id = CustomerIdGenerator.getNextId();
        this.startQueueTime = 0;
        this.endQueueTime = 0;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getQueueStartTime() {
        return this.startQueueTime;
    }

    public void setQueueStartTime() {
        this.startQueueTime = System.currentTimeMillis();
    }

    public long getQueueEndTime() {
        return this.endQueueTime;
    }

    public void setQueueEndTime() {
        this.endQueueTime = System.currentTimeMillis();
    }

    public long getQueueTimeSpent() {
        return endQueueTime - startQueueTime;
    }

}