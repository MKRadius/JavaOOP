import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ServicePoint svcPoint = new ServicePoint();
        int cusNum = 10;

        CustomerGenerator.generateCustomers(svcPoint, cusNum);

        System.out.println(cusNum + " customers in the queue.");

        svcPoint.serve();

        System.out.println("Average service time: " + (svcPoint.getSumServiceTime() / cusNum) + "ms.");

        scanner.close();
    }
}