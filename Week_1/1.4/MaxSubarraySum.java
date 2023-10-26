import java.util.Scanner;

public class MaxSubarraySum {

    public static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {

        String arrSizeInput;
        int arrSize;

        System.out.print("Enter the size of the array: ");
        arrSizeInput = scanner.next();

        if (!isIntNumber(arrSizeInput) || Integer.parseInt(arrSizeInput) <= 0) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        arrSize = Integer.parseInt(arrSizeInput);
        
        int[] arr = inputInt(arrSize);

        findMaxSum(arr);

        scanner.close();
    }

    public static boolean isIntNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static int[] inputInt(int size) {
        String input;
        int[] intArr = new int[size];

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            input = scanner.next();

            if (!isIntNumber(input)) {
                System.out.println("Invalid input");
                i--;
                continue;
            }

            intArr[i] = Integer.parseInt(input);
        }

        return intArr;
    }

    public static void findMaxSum(int[] arr) {
        int sum = 0, begin = 0, end = 0;
        int maxSum = arr[0], maxBegin = 1, maxEnd = 1;

        //Checking each element for max number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
                maxBegin = i + 1;
                maxEnd = i + 1;
            }
        }

        // Checking subarrays that has at least 2 elements
        for (int range = 1; range <= arr.length; range++) {
            begin = 0;
            
            while ((begin + range) <= arr.length) {
                sum = 0;
                end = begin + range;
                
                for (int i = begin; i < end; i++) {
                    sum += arr[i];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    maxBegin = begin + 1; //+1 due to "begin" being the index of the array
                    maxEnd = end; 
                }
                begin++;
            }
        }

        System.out.println("");
        System.out.println("Maximum sum: " + maxSum);
        if (maxBegin == maxEnd) {
            System.out.print("Integer: " + maxBegin);
        }
        else {
            System.out.print("Integers: " + maxBegin + "-" + maxEnd);
        }
    }
}