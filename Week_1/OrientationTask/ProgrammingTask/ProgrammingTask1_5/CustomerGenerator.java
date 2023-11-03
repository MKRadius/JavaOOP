public class CustomerGenerator {
    public static void generateCustomers(ServicePoint servicePoint, int numCustomers) {
        for (int i = 1; i <= numCustomers; i++) {
            Customer customer = new Customer();
            servicePoint.addToQueue(customer);
        }
    }
}
