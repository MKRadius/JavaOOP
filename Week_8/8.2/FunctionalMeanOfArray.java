import java.util.Arrays;

public class FunctionalMeanOfArray {
    public static void main(String[] args) {
        double[] numbers = { 3, 7, 1, 9, 2, 5 };
        double[] zeros = {};

        System.out.println("Mean of the array: " + Arrays.stream(numbers).average().orElse(0));
        System.out.println("Mean of the array: " + Arrays.stream(zeros).average().orElse(0));
    }
}
