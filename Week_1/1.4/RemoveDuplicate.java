import java.util.Scanner;

public class RemoveDuplicate {
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

        int[] filteredArr = filterArray(arr);

        System.out.println("The array without duplicates:");
        for (int a : filteredArr) {
            System.out.print(a + " ");
        }

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

    public static int[] filterArray(int[] arr) {
        int[] filteredArray = new int[arr.length];
        int j = 0;

        if (arrayHasZero(arr)) {
            filteredArray[j++] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!isDuplicate(arr[i],  filteredArray)) {
                filteredArray[j++] = arr[i];
            }
        }

        int[] finalArray = new int[j];

        for (int i = 0; i < j; i++) {
            finalArray[i] = filteredArray[i];
        }     

        return finalArray;
    }

    public static boolean isDuplicate(int element, int[] array) {
        for (int a : array) {
            if (element == a) {
                return true;
            }
        }
        return false;
    }

    public static boolean arrayHasZero(int[] array) {
        for (int a : array) {
            if (a == 0) {
                return true;
            }
        }
        return false;
    }
}
