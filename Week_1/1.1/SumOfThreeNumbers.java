import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));

        double avg = ((double) (first + second + third)) / 3.0; // Using double gives more precision instead of using float
        System.out.println("The average of the numbers is " + String.format("%.13f", avg));

        scanner.close();
    }
}