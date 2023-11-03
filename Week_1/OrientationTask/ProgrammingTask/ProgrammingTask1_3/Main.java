public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        // Customer c2 = new Customer();

        System.out.println(c1.getId());
        // System.out.println(c2.getId());

        c1.setStartTime();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c1.setEndTime();

        System.out.println("Customer ID: " + c1.getId());
        System.out.println("Start Time: " + c1.getStartTime() + " ms");
        System.out.println("End Time: " + c1.getEndTime() + " ms");
        System.out.println("Time Spent: " + c1.getTimeSpent() + " ms");

    }
}