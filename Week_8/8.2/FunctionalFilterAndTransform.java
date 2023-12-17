import java.util.Arrays;
import java.util.List;

public class FunctionalFilterAndTransform {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 3, 12);

        Integer[] oddNumbers = numbers.stream().filter(num -> num % 2 != 0).toArray(Integer[]::new);
        Integer[] doubledOddNumbers = Arrays.stream(oddNumbers).map(num -> num * 2).toArray(Integer[]::new);
        int sumOfDoubledOddNumbers = Arrays.stream(doubledOddNumbers).mapToInt(Integer::intValue).sum();

        System.out.println("Original List: " + numbers);
        System.out.println("Odd Numbers: " + Arrays.toString(oddNumbers));
        System.out.println("Doubled Odd Numbers: " + Arrays.toString(doubledOddNumbers));
        System.out.println("Sum of Doubled Odd Numbers: " + sumOfDoubledOddNumbers);
    }
}