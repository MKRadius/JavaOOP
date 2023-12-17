import java.util.*;

public class CollectionOperationsLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 3, 12);

        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        List<Integer> doubledOddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                doubledOddNumbers.add(number * 2);
            }
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Original List: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Doubled Odd Numbers: " + doubledOddNumbers);
        System.out.println("Sum of All Numbers: " + sum);
    }
}
