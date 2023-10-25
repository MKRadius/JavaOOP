import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input binary: ");
        String input = scanner.nextLine();

        int decimal = Integer.parseInt(input, 2);

        System.out.println(decimal);

        scanner.close();
    }
}