import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input binary: ");
        String input = scanner.nextLine();

        if (isBinary(input)) {
            // Convert using parseInt
            // int decimal = Integer.parseInt(input, 2);

            // Convert using custom logic
            int decimal = convBinToDec(input);

            System.out.println("Result: " + decimal);
        }
        else {
            System.out.print("Invalid input");
        }

        scanner.close();
    }

    public static boolean isBinary(String str) {
        try {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                    return false;
                }
            }
            return true;
        }
        catch (Error e) {
            return false;
        }
    }

    public static int convBinToDec(String str) {
        int value = 0;

        for (int i = 0; i < str.length(); i++) {
            int bin = Character.getNumericValue(str.charAt(str.length() - 1 - i));
            value += Math.pow(2, i) * bin;
        }

        return value;
    }
}