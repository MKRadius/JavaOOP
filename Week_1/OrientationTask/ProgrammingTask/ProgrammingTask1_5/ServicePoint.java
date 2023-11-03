import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> customerQueue = new LinkedList<Customer>();
    long sumServiceTime = 0;

    public void addToQueue(Customer cus) {
        this.customerQueue.addFirst(cus);
        cus.setQueueStartTime();
    }

    public Customer removeFromQueue() {
        Customer cus = this.customerQueue.removeLast();
        return cus;
    }

    public boolean isEmpty() {
        return this.customerQueue.isEmpty();
    }

    public void serve() {
        while (!this.customerQueue.isEmpty()) {
            Customer serveCustomer = this.removeFromQueue();
            serveCustomer.setQueueEndTime();

            long serviceTime = (long) (Math.random() * 1000);

            try {
                Thread.sleep(serviceTime);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
   
            System.out.println("Customer " + serveCustomer.getId() + " served.");
            System.out.println("    Queue Time:    " + serveCustomer.getQueueTimeSpent() + "ms.");
            System.out.println("    Service time:  " + serviceTime + "ms.");
            System.out.println("    Response time: " + (serveCustomer.getQueueTimeSpent() + serviceTime) + "ms.");
        }
    }
}
