public class Customer {
    private static int totalId = 0;
    private int id;
    private double arrivalTime;
    private double removalTime;

    public Customer() {
        this.id = ++totalId;
        this.arrivalTime = 0;
        this.arrivalTime = 0;
    }

    public Customer(double arrivalTime) {
        id = ++totalId;
        this.arrivalTime = arrivalTime;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getRemovalTime() {
        return removalTime;
    }

    public void setRemovalTime(double removalTime) {
        this.removalTime = removalTime;
    }

    public void printArrivalTime() {
        System.out.println("Customer ID-" + id + " arrived at " + arrivalTime);
    }

    public void printRemovalTime() {
        System.out.println("Customer ID-" + id + " removed at " + removalTime);
    }

    public void printDetails(Customer cus) {
        System.out.println("Customer " + cus.getId() + " served.");
        System.out.println("    Arrived: " + arrivalTime);
        System.out.println("    Removed: " + removalTime);
        System.out.println("    Stayed:  " + (removalTime - arrivalTime));
    }
}