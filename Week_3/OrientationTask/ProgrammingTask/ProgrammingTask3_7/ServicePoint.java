import eduni.distributions.Normal;
import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> customerQueue = new LinkedList<Customer>();
    long sumServiceTime = 0;

    public void addToQueue(Customer cus) {
        this.customerQueue.addFirst(cus);
    }

    public Customer removeFromQueue() {
        if (customerQueue.size() > 0) {
            Customer cus = this.customerQueue.removeLast();
            return cus;
        }
        else return null;

    }

    public boolean isEmpty() {
        return this.customerQueue.isEmpty();
    }

    public long getSumServiceTime() {
        return sumServiceTime;
    }

    public void serve() {
        while (!this.customerQueue.isEmpty()) {
            Customer serveCustomer = this.removeFromQueue();
            Normal normalGenerator = new Normal(5, 1);
   
            while (serveCustomer != null) {
                Clock.getInstance().setClock(Clock.getInstance().getClock() + normalGenerator.sample());
    
                serveCustomer.setRemovalTime(Clock.getInstance().getClock());
                serveCustomer.printDetails(serveCustomer);
    
                serveCustomer = removeFromQueue();
            }
        }
    }
}
