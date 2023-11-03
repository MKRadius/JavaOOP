import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Customer> customerQueue = new LinkedList<>();
        int choice = 0;

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Enqueue a customer");
            System.out.println("2. Dequeue a customer");
            System.out.println("3. Quit");

            try {
                choice = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                continue;
            }

            if (choice == 1) {
                Customer newCustomer = new Customer();
                newCustomer.setStartTime();

                customerQueue.addFirst(newCustomer);

                System.out.println("Customer " + newCustomer.getId() + " has been enqueued.");
            }
            else if (choice == 2) {
                if (customerQueue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    Customer removedCustomer = customerQueue.removeLast();
                    removedCustomer.setEndTime();

                    long timeSpent = removedCustomer.getTimeSpent();

                    System.out.println("Customer " + removedCustomer.getId() + " has been dequeued.");
                    System.out.println("Time spent in the queue: " + timeSpent + " ms");
                }
            }
            else if (choice == 3) {
                System.out.println("Exit.");
                break;
            }
            else {
                System.out.println("Invalid option.");
                break;
            }
        }

        scanner.close();
    }
}